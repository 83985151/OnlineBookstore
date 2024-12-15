<%@ page import="java.util.List" %>
<%@ page import="com.bookshop.bean.Books" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="m" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
  <head>
    <title>图书信息管理页面</title>
    <meta http-equiv="X-UA-Compatible" content="IE=edge"/>
    <meta http-equiv="content-type" content="text/html; charset=utf-8"/>
    <link href="ziyuan(4)/resources/css/axure_rp_page.css" type="text/css" rel="stylesheet"/>
    <link href="ziyuan(4)/data/styles.css" type="text/css" rel="stylesheet"/>
    <link href="ziyuan(4)/files/图书信息管理页面/styles.css" type="text/css" rel="stylesheet"/>
    <script src="ziyuan(4)/resources/scripts/jquery-3.2.1.min.js"></script>
    <script src="ziyuan(4)/resources/scripts/axure/axQuery.js"></script>
    <script src="ziyuan(4)/resources/scripts/axure/globals.js"></script>
    <script src="ziyuan(4)/resources/scripts/axutils.js"></script>
    <script src="ziyuan(4)/resources/scripts/axure/annotation.js"></script>
    <script src="ziyuan(4)/resources/scripts/axure/axQuery.std.js"></script>
    <script src="ziyuan(4)/resources/scripts/axure/doc.js"></script>
    <script src="ziyuan(4)/resources/scripts/messagecenter.js"></script>
    <script src="ziyuan(4)/resources/scripts/axure/events.js"></script>
    <script src="ziyuan(4)/resources/scripts/axure/recording.js"></script>
    <script src="ziyuan(4)/resources/scripts/axure/action.js"></script>
    <script src="ziyuan(4)/resources/scripts/axure/expr.js"></script>
    <script src="ziyuan(4)/resources/scripts/axure/geometry.js"></script>
    <script src="ziyuan(4)/resources/scripts/axure/flyout.js"></script>
    <script src="ziyuan(4)/resources/scripts/axure/model.js"></script>
    <script src="ziyuan(4)/resources/scripts/axure/repeater.js"></script>
    <script src="ziyuan(4)/resources/scripts/axure/sto.js"></script>
    <script src="ziyuan(4)/resources/scripts/axure/utils.temp.js"></script>
    <script src="ziyuan(4)/resources/scripts/axure/variables.js"></script>
    <script src="ziyuan(4)/resources/scripts/axure/drag.js"></script>
    <script src="ziyuan(4)/resources/scripts/axure/move.js"></script>
    <script src="ziyuan(4)/resources/scripts/axure/visibility.js"></script>
    <script src="ziyuan(4)/resources/scripts/axure/style.js"></script>
    <script src="ziyuan(4)/resources/scripts/axure/adaptive.js"></script>
    <script src="ziyuan(4)/resources/scripts/axure/tree.js"></script>
    <script src="ziyuan(4)/resources/scripts/axure/init.temp.js"></script>
    <script src="ziyuan(4)/resources/scripts/axure/legacy.js"></script>
    <script src="ziyuan(4)/resources/scripts/axure/viewer.js"></script>
    <script src="ziyuan(4)/resources/scripts/axure/math.js"></script>
    <script src="ziyuan(4)/resources/scripts/axure/jquery.nicescroll.min.js"></script>
    <script src="ziyuan(4)/data/document.js"></script>
    <script src="ziyuan(4)/files/图书信息管理页面/data.js"></script>
    <script type="text/javascript">
      $axure.utils.getTransparentGifPath = function() { return 'resources/images/transparent.gif'; };
      $axure.utils.getOtherPath = function() { return 'resources/Other.html'; };
      $axure.utils.getReloadPath = function() { return 'resources/reload.html'; };
    </script>
  </head>
  <body>
  <table>

      <!-- Unnamed (矩形) -->
      <div id="u0" class="ax_default box_1">
        <div id="u0_div" class=""></div>
        <div id="u0_text" class="text " style="display:none; visibility: hidden">
          <p></p>
        </div>
      </div>

      <!-- Unnamed (矩形) -->
      <div id="u1" class="ax_default box_1">
        <div id="u1_div" class=""></div>
        <div id="u1_text" class="text " style="display:none; visibility: hidden">
          <p><tbody id="bookslist" style="position:relative;top: 270px;left: 260px;right: 600px;bottom: 100px">
          <m:forEach items="${booksList}" var="books">
              <tr>
                  <td>${books.bookname}</td>
                  <td>&nbsp;&nbsp;&nbsp;&nbsp;${books.author}</td>
                  <td>&nbsp;${books.date}</td>
                  <td>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;${books.sort}</td>
                  <td>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;${books.price}</td>
                  <td>
                      &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                      <a href="findBooksById?bid=${books.bid}">修改</a>&nbsp;
                      <a href="delBooks?bid=${books.bid}">删除</a>
                  </td>
              </tr>
          </m:forEach>
          </tbody></p>
        </div>
      </div>

      <!-- Unnamed (矩形) -->
      <div id="u2" class="ax_default _一级标题">
        <div id="u2_div" class=""></div>
        <div id="u2_text" class="text ">
          <p><span>图书信息管理</span></p>
        </div>
      </div>

      <!-- Unnamed (矩形) -->
      <div id="u3" class="ax_default box_1">
        <div id="u3_div" class=""></div>
        <div id="u3_text" class="text " style="display:none; visibility: hidden">
          <p></p>
        </div>
      </div>

      <!-- Unnamed (矩形) -->
      <a href="managerPage.jsp">
      <div id="u4" class="ax_default button">
          <p><span><input type="button" style=“size:10px;width:110px;height:30px;background-color:lightgray “ value="返回首页"></span></p>
      </div>
      </a>
      <!-- Unnamed (矩形) -->
      <a href="addBooks.jsp">
      <div id="u5" class="ax_default link_button">
        <div id="u5_div" class=""></div>
        <div id="u5_text" class="text ">
          <p><span>添加图书</span></p>
        </div>
      </div>
      </a>

      <!-- Unnamed (矩形) -->
      <div id="u6" class="ax_default _二级标题">
        <div id="u6_div" class=""></div>
        <div id="u6_text" class="text ">
          <p><span>请输入您想修改的图书名：</span></p>
        </div>
      </div>

      <!-- Unnamed (文本框) -->
          <form action="managerseachBooks" method="post">
      <div id="u7" class="ax_default text_field">
        <div id="u7_div" class=""></div>
        <input id="u7_input" type="text" name="keyword" value="" class="u7_input"/>
      </div>
      <!-- Unnamed (矩形) -->
      <div id="u15" class="ax_default button">
        <div id="u15_text" class="text ">
          <p><span><input type="submit" style=“size:10px;width:110px;height:30px;background-color:ghostwhite “ value="搜索"></span></p>
        </div>
      </div>
      </form>

      <thead>
      <tr>
      <!-- Unnamed (矩形) -->
          <th>
      <div id="u9" class="ax_default _三级标题">
          <p><span>图书名</span></p>
        </div>
      </div>
          </th>

      <!-- Unnamed (矩形) -->
          <th>
      <div id="u10" class="ax_default _三级标题">
          <p><span>作者</span></p>
        </div>
      </div>
          </th>

      <!-- Unnamed (矩形) -->
          <th>
      <div id="u11" class="ax_default _三级标题">
          <p><span>出版日期</span></p>
        </div>
      </div>
          </th>

      <!-- Unnamed (矩形) -->
          <th>
      <div id="u12" class="ax_default _三级标题">
          <p><span>价格</span></p>
        </div>
      </div>
          </th>

      <!-- Unnamed (矩形) -->
          <th>
      <div id="u13" class="ax_default _三级标题">
          <p><span>图书分类</span></p>
        </div>
      </div>
          </th>

      <!-- Unnamed (矩形) -->
          <th>
      <div id="u14" class="ax_default _三级标题">
          <p><span>操作</span></p>
        </div>
      </div>
          </th>
      </tr>
      </thead>
      </table>

    <script src="ziyuan(4)/resources/scripts/axure/ios.js"></script>
  </body>
</html>
