package com.toyshop.www.controllers;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang3.StringUtils;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.toyshop.data.entity.Member;
import com.toyshop.data.entity.Product;
import com.toyshop.service.ProductService;

@Controller
@RequestMapping("/cart")
public class CartController extends CustomerController {
	@Autowired
	ProductService service;

	@RequestMapping(value = "add", method = RequestMethod.POST)
	@ResponseBody
	public String add(HttpServletResponse response, Integer id, Integer amount, @CookieValue("cart") String cookieCart) {

		if (id == null) {
			return "id参数错误！";
		}

		Product product = service.findById(id);

		if (product == null) {
			return "该商品不存在！";
		}

		// if ($size_id == "" || $size_id == "0") {
		// msgto ( "请先选择尺码！", "-1" );
		// }

		if (amount == null) {
			return "数量参数错误！";
		}
		if (amount < 1) {
			return "商品数量不符合规格！";
		}

		// $size_db = D ( "product_size" );
		// $psize = $size_db->where (
		// "productid=$id and sizeid=$size_id and amount>=$amount" )->find ();
		//
		// if ($psize == '') {
		// msgto ( "该尺码的鞋子库存不足！", "-1" );
		// }

		// $info_db = D ( "Property" );
		// $info = $info_db->get ( $size_id );
		// $size = $info->name;

		if (!isLogin()) {
			boolean has = false;
			List<List<Integer>> cart_items = cookieItems(cookieCart);
			// //echo sizeof($cart_items);exit;
			for (int i = 0; i < cart_items.size(); i++) {

				if (cart_items.get(i).get(1) == id) {
					int total = cart_items.get(i).get(3) + amount;
					cart_items.get(i).set(3, total);
					has = true;
				}
			}
			if (!has) {
				// array_push ( $cart_items, array (
				// 0,
				// $id,
				// $size_id,
				// $amount,
				// $size
				// ) );
			}
			//
			updateCookieItems(response, cart_items);
			// header ( "location:../gwc.php" );
		} else {
			// $user_id = $_SESSION ['userid'];
			// $user = D ( 'user' );
			Member member = super.getCurrentMember();
			// $usermodel = $user->where ( "id=$user_id" )->find ();
			//
			// $shoe_name = $product ['title'];
			// $shoe_price = $psize ['price'];
			// // print_r($model);exit;
			// // $shoe_pic=explode(";",$model['recpic']);
			//
			// //
			// if(count($shoe_pic)==0){$shoe_pic=$model['recpic'];}else{$shoe_pic=$shoe_pic[0];}
			//
			// $product = array (
			// 'id' => $id,
			// 'product_id' => $id,
			// 'amount' => $amount,
			// 'size_id' => $size_id,
			// 'size' => $size,
			// 'user_id' => $user_id,
			// 'product_name' => $shoe_name,
			// 'price' => $shoe_price
			// );
			//
			// import ( "Shopcart" );
			// $user_id = $_SESSION ['userid'];
			// $shopcar = new Shopcart ( $user_id );
			//
			// if ($shopcar->show_num () > 9) {
			// echo "error";
			// } else {
			// $ok = $shopcar->add ( $product );
			// if ($ok == "ok")
			// header ( "location:../gwc.php" );
			// else
			// echo "添加失败！";
		}
		return "";
	}

	@RequestMapping(value = "")
	public String cart() {

		return "cart";
	}

	private List<List<Integer>> cookieItems(String cartCookie) {
		List<List<Integer>> cart_items = new ArrayList<List<Integer>>();
		if (!StringUtils.isBlank(cartCookie)) {
			String[] arr1 = cartCookie.split(";");

			for (String a1 : arr1) {
				List<Integer> data = new ArrayList<Integer>();
				String[] arr2 = a1.split(",");
				for (String a2 : arr2) {
					data.add(Integer.getInteger(a2));
				}
				cart_items.add(data);
			}
		}
		return cart_items;
	}

	private void updateCookieItems(HttpServletResponse response, List<List<Integer>> cart_items) {
		String cart_cookie = "";
		for (List<Integer> item : cart_items) {
			Integer a = item.get(0);
			Integer b = item.get(1);
			Integer c = item.get(2);
			Integer d = item.get(3);
			Integer e = item.get(4);
			if (!StringUtils.isBlank(cart_cookie))
				cart_cookie += ";";
			cart_cookie += a + "," + b + "," + c + "," + d + "," + e;
		}
		Cookie cookie = new Cookie("cart", cart_cookie);
		response.addCookie(cookie);
	}
}
