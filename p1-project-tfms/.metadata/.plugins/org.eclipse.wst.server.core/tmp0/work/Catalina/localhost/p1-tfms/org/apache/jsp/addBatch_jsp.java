/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.71
 * Generated at: 2023-02-17 19:45:35 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class addBatch_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"utf-8\" />\r\n");
      out.write("<meta content=\"width=device-width, initial-scale=1.0\" name=\"viewport\" />\r\n");
      out.write("\r\n");
      out.write("<title>Coding Wallah Add Batch</title>\r\n");
      out.write("<meta content=\"\" name=\"description\" />\r\n");
      out.write("<meta content=\"\" name=\"keywords\" />\r\n");
      out.write("\r\n");
      out.write("<!-- Favicons -->\r\n");
      out.write("<link href=\"assets/img/favicon.png\" rel=\"icon\" />\r\n");
      out.write("<link href=\"assets/img/apple-touch-icon.png\" rel=\"apple-touch-icon\" />\r\n");
      out.write("\r\n");
      out.write("<!-- Google Fonts -->\r\n");
      out.write("<link\r\n");
      out.write("	href=\"https://fonts.googleapis.com/css?family=Open+Sans:300,300i,400,400i,600,600i,700,700i|Raleway:300,300i,400,400i,500,500i,600,600i,700,700i|Poppins:300,300i,400,400i,500,500i,600,600i,700,700i\"\r\n");
      out.write("	rel=\"stylesheet\" />\r\n");
      out.write("\r\n");
      out.write("<script src=\"https://kit.fontawesome.com/6ce3a30560.js\"\r\n");
      out.write("	crossorigin=\"anonymous\"></script>\r\n");
      out.write("\r\n");
      out.write("<!-- Vendor CSS Files -->\r\n");
      out.write("<link href=\"assets/vendor/animate.css/animate.min.css\" rel=\"stylesheet\" />\r\n");
      out.write("<link href=\"assets/vendor/aos/aos.css\" rel=\"stylesheet\" />\r\n");
      out.write("<link href=\"assets/vendor/bootstrap/css/bootstrap.min.css\"\r\n");
      out.write("	rel=\"stylesheet\" />\r\n");
      out.write("<link href=\"assets/vendor/bootstrap-icons/bootstrap-icons.css\"\r\n");
      out.write("	rel=\"stylesheet\" />\r\n");
      out.write("<link href=\"assets/vendor/boxicons/css/boxicons.min.css\"\r\n");
      out.write("	rel=\"stylesheet\" />\r\n");
      out.write("<link href=\"assets/vendor/remixicon/remixicon.css\" rel=\"stylesheet\" />\r\n");
      out.write("<link href=\"assets/vendor/swiper/swiper-bundle.min.css\" rel=\"stylesheet\" />\r\n");
      out.write("\r\n");
      out.write("<!-- Template Main CSS File -->\r\n");
      out.write("<link href=\"assets/css/style.css\" rel=\"stylesheet\" />\r\n");
      out.write("\r\n");
      out.write("<!-- =======================================================\r\n");
      out.write("  * Template Name: Mentor - v4.10.0\r\n");
      out.write("  * Template URL: https://bootstrapmade.com/mentor-free-education-bootstrap-theme/\r\n");
      out.write("  * Author: BootstrapMade.com\r\n");
      out.write("  * License: https://bootstrapmade.com/license/\r\n");
      out.write("  ======================================================== -->\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("	<!-- ======= Header ======= -->\r\n");
      out.write("	<header id=\"header\" class=\"fixed-top\">\r\n");
      out.write("		<div class=\"container d-flex align-items-center\">\r\n");
      out.write("			<h1 class=\"logo me-auto\">\r\n");
      out.write("				<a href=\"index2.html\">Coding Wallah</a>\r\n");
      out.write("			</h1>\r\n");
      out.write("			<!-- Uncomment below if you prefer to use an image logo -->\r\n");
      out.write("			<!-- <a href=\"index.html\" class=\"logo me-auto\"><img src=\"assets/img/logo.png\" alt=\"\" class=\"img-fluid\"></a>-->\r\n");
      out.write("\r\n");
      out.write("			<nav id=\"navbar\" class=\"navbar order-last order-lg-0\">\r\n");
      out.write("				<ul>\r\n");
      out.write("					<li><a class=\"active\" href=\"index2.html\">Home</a></li>\r\n");
      out.write("					<li class=\"dropdown\"><a href=\"#\"><span>Operations</span> <i\r\n");
      out.write("							class=\"bi bi-chevron-down\"></i></a>\r\n");
      out.write("						<ul>\r\n");
      out.write("							<li><a href=\"showBatches.jsp\">Show All Batch Details</a></li>\r\n");
      out.write("							<li><a href=\"addBatch.jsp\">Add Batch</a></li>\r\n");
      out.write("							<li><a href=\"editBatch.jsp\">Update Batch</a></li>\r\n");
      out.write("							<li><a href=\"deleteBatch.jsp\">Delete Batch</a></li>\r\n");
      out.write("						</ul></li>\r\n");
      out.write("				</ul>\r\n");
      out.write("				<i class=\"bi bi-list mobile-nav-toggle\"></i>\r\n");
      out.write("			</nav>\r\n");
      out.write("			<!-- .navbar -->\r\n");
      out.write("\r\n");
      out.write("			<a href=\"landingPage.html\" class=\"get-started-btn\">Logout</a>\r\n");
      out.write("		</div>\r\n");
      out.write("	</header>\r\n");
      out.write("	<!-- End Header -->\r\n");
      out.write("\r\n");
      out.write("	<main id=\"main\">\r\n");
      out.write("		<!-- ======= Breadcrumbs ======= -->\r\n");
      out.write("		<div class=\"breadcrumbs\" data-aos=\"fade-in\">\r\n");
      out.write("			<div class=\"container\">\r\n");
      out.write("				<h2>Add Batch</h2>\r\n");
      out.write("			</div>\r\n");
      out.write("		</div>\r\n");
      out.write("		<!-- End Breadcrumbs -->\r\n");
      out.write("\r\n");
      out.write("		<section class=\"vh-100\" style=\"background-color: #eee\">\r\n");
      out.write("			<div class=\"container h-100\">\r\n");
      out.write("				<div\r\n");
      out.write("					class=\"row d-flex justify-content-center align-items-center h-100\">\r\n");
      out.write("					<div class=\"col-lg-12 col-xl-11\">\r\n");
      out.write("						<div class=\"card text-black\" style=\"border-radius: 25px\">\r\n");
      out.write("							<div class=\"card-body p-md-5\">\r\n");
      out.write("								<div class=\"row justify-content-center\">\r\n");
      out.write("									<div class=\"col-md-10 col-lg-6 col-xl-5 order-2 order-lg-1\">\r\n");
      out.write("										<p class=\"text-center h1 fw-bold mb-5 mx-1 mx-md-4 mt-4\">\r\n");
      out.write("											Add Batch Details</p>\r\n");
      out.write("										<form method=\"get\" action=\"AddBatch\" class=\"mx-1 mx-md-4\">\r\n");
      out.write("											<div class=\"d-flex flex-row align-items-center mb-4\">\r\n");
      out.write("												<i class=\"fas fa-book fa-lg me-3 fa-fw\"></i>\r\n");
      out.write("												<div class=\"form-outline flex-fill mb-0\">\r\n");
      out.write("													<input type=\"text\" name=\"topicName\" id=\"form3Example1c\"\r\n");
      out.write("														class=\"form-control\" placeholder=\"Enter Batch Name\" />\r\n");
      out.write("												</div>\r\n");
      out.write("											</div>\r\n");
      out.write("											<div class=\"d-flex flex-row align-items-center mb-4\">\r\n");
      out.write("												<!-- <i class=\"bx bx-group\"></i> -->\r\n");
      out.write("												<i class=\"fa-solid fa-clock -lg me-3 fa-fw\"></i>\r\n");
      out.write("												<div class=\"form-outline flex-fill mb-0\">\r\n");
      out.write("													<input type=\"number\" name=\"batchDuration\"\r\n");
      out.write("														id=\"form3Example1c\" class=\"form-control\"\r\n");
      out.write("														placeholder=\"Batch Duration\" />\r\n");
      out.write("												</div>\r\n");
      out.write("											</div>\r\n");
      out.write("\r\n");
      out.write("											<div class=\"d-flex flex-row align-items-center mb-4\">\r\n");
      out.write("												<!-- <i class=\"bx bx-user-pin\"></i> -->\r\n");
      out.write("\r\n");
      out.write("												<i class=\"fa fa-calendar fa-lg me-3 fa-fw\"></i>\r\n");
      out.write("												<div class=\"form-outline flex-fill mb-0\">\r\n");
      out.write("\r\n");
      out.write("													<input type=\"text\" name=\"startDate\" id=\"form3Example1c\"\r\n");
      out.write("														class=\"form-control\" onfocus=\"(this.type='Date')\"\r\n");
      out.write("														placeholder=\"Start Date\" />\r\n");
      out.write("												</div>\r\n");
      out.write("											</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("											<div class=\"d-flex flex-row align-items-center mb-4\">\r\n");
      out.write("												<!-- <i class=\"bx bx-user-pin\"></i> -->\r\n");
      out.write("\r\n");
      out.write("												<i class=\"fa fa-calendar fa-lg me-3 fa-fw\"></i>\r\n");
      out.write("												<div class=\"form-outline flex-fill mb-0\">\r\n");
      out.write("\r\n");
      out.write("													<input type=\"text\" name=\"endDate\" id=\"form3Example1c\"\r\n");
      out.write("														class=\"form-control\" onfocus=\"(this.type='Date')\"\r\n");
      out.write("														placeholder=\"End Date\" />\r\n");
      out.write("												</div>\r\n");
      out.write("											</div>\r\n");
      out.write("\r\n");
      out.write("											<div class=\"d-flex flex-row align-items-center mb-4\">\r\n");
      out.write("												<!-- <i class=\"bx bx-user-pin\"></i> -->\r\n");
      out.write("\r\n");
      out.write("												<i class=\"fa fa-id-card -lg me-3 fa-fw\" aria-hidden=\"true\"></i>\r\n");
      out.write("												<div class=\"form-outline flex-fill mb-0\">\r\n");
      out.write("\r\n");
      out.write("													<input type=\"text\" name=\"trainerId\" id=\"form3Example1c\"\r\n");
      out.write("														class=\"form-control\" placeholder=\"Trainer Id\" />\r\n");
      out.write("												</div>\r\n");
      out.write("											</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("											<div class=\"d-flex flex-row align-items-center mb-4\">\r\n");
      out.write("												<!-- <i class=\"bx bx-user-pin\"></i> -->\r\n");
      out.write("\r\n");
      out.write("												<i class=\"fa fa-id-card -lg me-3 fa-fw\" aria-hidden=\"true\"></i>\r\n");
      out.write("												<div class=\"form-outline flex-fill mb-0\">\r\n");
      out.write("\r\n");
      out.write("													<input type=\"text\" name=\"associateId\" id=\"form3Example1c\"\r\n");
      out.write("														class=\"form-control\" placeholder=\"Associate Id\" />\r\n");
      out.write("												</div>\r\n");
      out.write("											</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("											<div class=\"d-flex justify-content-center mx-4 mb-3 mb-lg-4\">\r\n");
      out.write("												<input type=\"submit\" value=\"Add Batch\"\r\n");
      out.write("													class=\"btn btn-primary btn-lg\">\r\n");
      out.write("											</div>\r\n");
      out.write("										</form>\r\n");
      out.write("										<!--   <div\r\n");
      out.write("											class=\"col-md-10 col-lg-6 col-xl-7 d-flex align-items-center order-1 order-lg-2\">\r\n");
      out.write("											<img src=\"my_img/add-animate.svg\" class=\"img-fluid\"\r\n");
      out.write("												alt=\"Sample image\" />\r\n");
      out.write("										</div> -->\r\n");
      out.write("									</div>\r\n");
      out.write("								</div>\r\n");
      out.write("							</div>\r\n");
      out.write("						</div>\r\n");
      out.write("					</div>\r\n");
      out.write("				</div>\r\n");
      out.write("			</div>\r\n");
      out.write("		</section>\r\n");
      out.write("	</main>\r\n");
      out.write("	<!-- End #main -->\r\n");
      out.write("\r\n");
      out.write("	<!-- ======= Footer ======= -->\r\n");
      out.write("	<footer id=\"footer\">\r\n");
      out.write("		<div class=\"footer-top\">\r\n");
      out.write("			<div class=\"container\">\r\n");
      out.write("				<div class=\"row\" style=\"justify-content: space-around\">\r\n");
      out.write("					<div class=\"col-lg-3 col-md-6 footer-contact\">\r\n");
      out.write("						<h3>Admin</h3>\r\n");
      out.write("						<p>\r\n");
      out.write("							CS12 Vinay Tripathi <br /> Noida U.P-231001<br /> India\r\n");
      out.write("							 <br /> <br /> <strong>Phone:</strong> +91 6388767957<br />\r\n");
      out.write("							<strong>Email:</strong> vinaytripathi6388@gmail.com<br />\r\n");
      out.write("						</p>\r\n");
      out.write("					</div>\r\n");
      out.write("\r\n");
      out.write("					<div class=\"col-lg-2 col-md-6 footer-links\">\r\n");
      out.write("						<h4>Useful Links</h4>\r\n");
      out.write("						<ul>\r\n");
      out.write("							<li><i class=\"bx bx-chevron-right\"></i> <a href=\"index.html\">Home</a>\r\n");
      out.write("							</li>\r\n");
      out.write("							<li><i class=\"bx bx-chevron-right\"></i> <a\r\n");
      out.write("								href=\"register.html\">Register New Trainer</a></li>\r\n");
      out.write("						</ul>\r\n");
      out.write("					</div>\r\n");
      out.write("\r\n");
      out.write("					<div class=\"col-lg-3 col-md-6 footer-links\">\r\n");
      out.write("						<h4>Operations</h4>\r\n");
      out.write("						<ul>\r\n");
      out.write("							<li><i class=\"bx bx-chevron-right\"></i> <a href=\"show.html\">Show\r\n");
      out.write("									All Trainer Details</a></li>\r\n");
      out.write("							<li><i class=\"bx bx-chevron-right\"></i> <a href=\"add.html\">Add\r\n");
      out.write("									Trainers</a></li>\r\n");
      out.write("						</ul>\r\n");
      out.write("					</div>\r\n");
      out.write("				</div>\r\n");
      out.write("			</div>\r\n");
      out.write("		</div>\r\n");
      out.write("\r\n");
      out.write("		<div class=\"container d-md-flex py-4\">\r\n");
      out.write("			<div class=\"me-md-auto text-center text-md-start\">\r\n");
      out.write("				<div class=\"copyright\">\r\n");
      out.write("					&copy; Copyright <strong><span>Coding Wallah</span></strong>. All Rights\r\n");
      out.write("					Reserved\r\n");
      out.write("				</div>\r\n");
      out.write("				<div class=\"credits\">\r\n");
      out.write("					<!-- All the links in the footer should remain intact. -->\r\n");
      out.write("					<!-- You can delete the links only if you purchased the pro version. -->\r\n");
      out.write("					<!-- Licensing information: https://bootstrapmade.com/license/ -->\r\n");
      out.write("					<!-- Purchase the pro version with working PHP/AJAX contact form: https://bootstrapmade.com/mentor-free-education-bootstrap-theme/ -->\r\n");
      out.write("					Designed by <a>Tripathi tech</a>\r\n");
      out.write("				</div>\r\n");
      out.write("			</div>\r\n");
      out.write("			<div class=\"social-links text-center text-md-right pt-3 pt-md-0\">\r\n");
      out.write("				<a href=\"#\" class=\"twitter\"><i class=\"bx bxl-twitter\"></i></a> <a\r\n");
      out.write("					href=\"#\" class=\"facebook\"><i class=\"bx bxl-facebook\"></i></a> <a\r\n");
      out.write("					href=\"#\" class=\"instagram\"><i class=\"bx bxl-instagram\"></i></a> <a\r\n");
      out.write("					href=\"#\" class=\"google-plus\"><i class=\"bx bxl-skype\"></i></a> <a\r\n");
      out.write("					href=\"https://www.linkedin.com/in/vinay-kumar-tiwari-46b524257\" class=\"linkedin\"><i class=\"bx bxl-linkedin\"></i></a>\r\n");
      out.write("			</div>\r\n");
      out.write("		</div>\r\n");
      out.write("	</footer>\r\n");
      out.write("	<!-- End Footer -->\r\n");
      out.write("\r\n");
      out.write("	<div id=\"preloader\"></div>\r\n");
      out.write("	<a href=\"#\"\r\n");
      out.write("		class=\"back-to-top d-flex align-items-center justify-content-center\"><i\r\n");
      out.write("		class=\"bi bi-arrow-up-short\"></i></a>\r\n");
      out.write("\r\n");
      out.write("	<!-- Vendor JS Files -->\r\n");
      out.write("	<script src=\"assets/vendor/purecounter/purecounter_vanilla.js\"></script>\r\n");
      out.write("	<script src=\"assets/vendor/aos/aos.js\"></script>\r\n");
      out.write("	<script src=\"assets/vendor/bootstrap/js/bootstrap.bundle.min.js\"></script>\r\n");
      out.write("	<script src=\"assets/vendor/swiper/swiper-bundle.min.js\"></script>\r\n");
      out.write("	<script src=\"assets/vendor/php-email-form/validate.js\"></script>\r\n");
      out.write("\r\n");
      out.write("	<!-- Template Main JS File -->\r\n");
      out.write("	<script src=\"assets/js/main.js\"></script>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
