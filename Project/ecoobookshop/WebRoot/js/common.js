function _change() {
	$("#vCode").attr("src", "/ecoobookshop/VerifyCodeServlet?" + new Date().getTime());
}