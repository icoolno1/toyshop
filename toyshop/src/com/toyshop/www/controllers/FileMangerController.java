package com.toyshop.www.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/files")
public class FileMangerController extends BaseController {
	@RequestMapping("index.aspx")
	public String index() {
		String baseFolder = "/upload";

		return "files/index";
	}
}
