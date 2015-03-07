package com.toyshop.www.controllers.admin;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.toyshop.www.views.CustomAttributs;
import com.toyshop.www.views.TreeNode;

@Controller
@RequestMapping("/admin/file")
public class AdminFileManageController extends BaseAdminController {
	@RequestMapping("")
	public String index(Model model) {
		String root = request.getServletContext().getRealPath("/upload");
		File f = new File(root);
		String[] files = f.list();
		model.addAttribute("files", files);
		return "admin/files/index";
	}

	@RequestMapping("createFolder")
	@ResponseBody
	public boolean createFolder(String parent, String name) throws IOException {
		String root = "/upload";
		if (!StringUtils.isEmpty(parent)) {
			root += "/" + parent;
		}
		root += "/" + name;
		String sub = request.getServletContext().getRealPath(root);
		File f = new File(sub);
		return f.mkdir();
	}

	@RequestMapping("delete")
	@ResponseBody
	public boolean delete(String file) throws IOException {
		String root = "/upload";

		root += "/" + file;
		String sub = request.getServletContext().getRealPath(root);
		File f = new File(sub);
		return f.delete();
	}
	
	@RequestMapping("loadFolders")
	@ResponseBody
	public List<TreeNode> loadFolders() {
		String root = "/upload";
		
		List<TreeNode> nodes = new ArrayList<TreeNode>();
		loadFolderTree(nodes, root);

		return nodes;
	}
	
	@RequestMapping("loadFiles")
	@ResponseBody
	public List<String> loadFiles(String folder) {
		String root = "/upload";
		root += "/" + folder;
		String aroot = request.getServletContext().getRealPath(root);
		File f = new File(aroot);
		String[] files = f.list();
		List<String> nodes = new ArrayList<String>();

		for (int i = 0; i < files.length; i++) {
			String rroot = root + "/" + files[i];
			String root2 = request.getServletContext().getRealPath(rroot);
			File f1 = new File(root2);
			if (f1.isFile()) {
				nodes.add(files[i]);
			}
		}
		
		return nodes;
	}
	
	private void loadFolderTree(List<TreeNode> nodes, String root) {
		String aroot = request.getServletContext().getRealPath(root);

		File f = new File(aroot);
		String[] files = f.list();

		for (int i = 0; i < files.length; i++) {
			String rroot = root + "/" + files[i];
			String root2 = request.getServletContext().getRealPath(rroot);
			File f1 = new File(root2);
			if (f1.isDirectory()) {
				TreeNode node = new TreeNode();
				node.setId(rroot.replace("/upload/", ""));
				node.setText(files[i]);
				CustomAttributs custom = new CustomAttributs();
				custom.setPath(rroot.replace("/upload/", ""));
				node.setAttributes(custom);
				nodes.add(node);
				loadFolderTree(node.getChildren(), rroot);
			}
		}
	}
}
