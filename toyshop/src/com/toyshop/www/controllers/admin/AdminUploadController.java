package com.toyshop.www.controllers.admin;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.toyshop.www.controllers.BaseController;

@Controller
@RequestMapping("/admin/files")
public class AdminUploadController extends BaseAdminController {
	@RequestMapping("upload.aspx")
	public String upload(Model model, String path) {

		model.addAttribute("path", path);
		return "admin/files/upload";
	}

	@RequestMapping("upload.do")
	public String save(Model model, String path,
			@RequestParam("filedata") MultipartFile filedata)
			throws IOException {
		String root = "/upload/";
		String sub = root += path;
		String filepath = sub += "/"+filedata.getOriginalFilename();
		filepath = request.getServletContext().getRealPath(sub);
		File file = new File(filepath);
		file.createNewFile();
		FileOutputStream fos = new FileOutputStream(file);
		byte[] buffer = new byte[1024 * 1024];
		int byteread = 0;
		InputStream stream = filedata.getInputStream();
		while ((byteread = stream.read(buffer)) != -1) {
			fos.write(buffer, 0, byteread);
			fos.flush();
		}
		fos.close();
		stream.close();
		model.addAttribute("path", path);
		return "admin/files/upload";
	}
}
