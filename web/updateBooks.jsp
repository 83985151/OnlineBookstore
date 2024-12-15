<%@ page import="java.util.List" %>
<%@ page import="com.bookshop.bean.Books" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="m" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
  <head>
    <title>编辑图书信息</title>
    <meta http-equiv="X-UA-Compatible" content="IE=edge"/>
    <meta http-equiv="content-type" content="text/html; charset=utf-8"/>
    <link href="ziyuan/resources/css/axure_rp_page.css" type="text/css" rel="stylesheet"/>
    <link href="ziyuan/data/styles.css" type="text/css" rel="stylesheet"/>
    <link href="ziyuan/files/编辑图书信息/styles.css" type="text/css" rel="stylesheet"/>
    <script src="ziyuan/resources/scripts/jquery-3.2.1.min.js"></script>
    <script src="ziyuan/resources/scripts/axure/axQuery.js"></script>
    <script src="ziyuan/resources/scripts/axure/globals.js"></script>
    <script src="ziyuan/resources/scripts/axutils.js"></script>
    <script src="ziyuan/resources/scripts/axure/annotation.js"></script>
    <script src="ziyuan/resources/scripts/axure/axQuery.std.js"></script>
    <script src="ziyuan/resources/scripts/axure/doc.js"></script>
    <script src="ziyuan/resources/scripts/messagecenter.js"></script>
    <script src="ziyuan/resources/scripts/axure/events.js"></script>
    <script src="ziyuan/resources/scripts/axure/recording.js"></script>
    <script src="ziyuan/resources/scripts/axure/action.js"></script>
    <script src="ziyuan/resources/scripts/axure/expr.js"></script>
    <script src="ziyuan/resources/scripts/axure/geometry.js"></script>
    <script src="ziyuan/resources/scripts/axure/flyout.js"></script>
    <script src="ziyuan/resources/scripts/axure/model.js"></script>
    <script src="ziyuan/resources/scripts/axure/repeater.js"></script>
    <script src="ziyuan/resources/scripts/axure/sto.js"></script>
    <script src="ziyuan/resources/scripts/axure/utils.temp.js"></script>
    <script src="ziyuan/resources/scripts/axure/variables.js"></script>
    <script src="ziyuan/resources/scripts/axure/drag.js"></script>
    <script src="ziyuan/resources/scripts/axure/move.js"></script>
    <script src="ziyuan/resources/scripts/axure/visibility.js"></script>
    <script src="ziyuan/resources/scripts/axure/style.js"></script>
    <script src="ziyuan/resources/scripts/axure/adaptive.js"></script>
    <script src="ziyuan/resources/scripts/axure/tree.js"></script>
    <script src="ziyuan/resources/scripts/axure/init.temp.js"></script>
    <script src="ziyuan/resources/scripts/axure/legacy.js"></script>
    <script src="ziyuan/resources/scripts/axure/viewer.js"></script>
    <script src="ziyuan/resources/scripts/axure/math.js"></script>
    <script src="ziyuan/resources/scripts/axure/jquery.nicescroll.min.js"></script>
    <script src="ziyuan/data/document.js"></script>
    <script src="ziyuan/files/编辑图书信息/data.js"></script>
    <script type="text/javascript">
      $axure.utils.getTransparentGifPath = function() { return 'resources/images/transparent.gif'; };
      $axure.utils.getOtherPath = function() { return 'resources/Other.html'; };
      $axure.utils.getReloadPath = function() { return 'resources/reload.html'; };
    </script>
  </head>
  <body>
  <form action="updateBooks" method="post">

      <!-- Unnamed (矩形) -->
      <div id="u16" class="ax_default box_1">
        <div id="u16_div" class=""></div>
        <div id="u16_text" class="text " style="display:none; visibility: hidden">
          <p></p>
        </div>
      </div>

      <!-- Unnamed (矩形) -->
      <div id="u17" class="ax_default box_1">
          <div id="u17_div" class=""></div>
          <div id="u17_text" class="text " style="display:none; visibility: hidden">
              <p></p>
          </div>
      </div>

      <!-- Unnamed (矩形) -->
      <div id="u18" class="ax_default _一级标题">
        <div id="u18_div" class=""></div>
        <div id="u18_text" class="text ">
          <p><span>编辑图书</span></p>
        </div>
      </div>

        <div id="u19" class="ax_default button">
          <p><span><input type="submit" style=“size:10px;width:110px;height:30px;background-color:mediumseagreen “ value="确认更改"></span></p>
        </div>

      <!-- Unnamed (矩形) -->
      <a href="BMS.jsp">
        <div id="u20" class="ax_default button">
          <p><span><input type="button" style=“size:10px;width:110px;height:30px;background-color:darkorange “ value="返回"></span></p>
        </div>
      </a>

      <!-- Unnamed (矩形) -->
      <div id="u21" class="ax_default _二级标题">
          <div id="u21_div" class=""></div>
          <div id="u21_text" class="text ">
          <p><span><label for="bookname">图书名</label></span></p>
        </div>
      </div>

      <!-- Unnamed (文本框) -->
      <div id="u22" class="ax_default text_field">
        <input id="bookname" name="bookname" type="text"  placeholder="图书名" value="${books.bookname}" >
      </div>

      <!-- Unnamed (矩形) -->
      <div id="u23" class="ax_default _二级标题">
          <div id="u23_div" class=""></div>
          <div id="u23_text" class="text ">
          <p><span><label for="author">图书作者</label></span></p>
        </div>
      </div>

      <!-- Unnamed (文本框) -->
      <div id="u24" class="ax_default text_field">
        <input id="author" name="author" type="text"  placeholder="图书作者" value="${books.author}" >
      </div>

      <!-- Unnamed (矩形) -->
      <div id="u25" class="ax_default _二级标题">
          <div id="u25_div" class=""></div>
          <div id="u25_text" class="text ">
          <p><span><label for="date">出版时间</label></span></p>
        </div>
      </div>

      <!-- Unnamed (文本框) -->
      <div id="u26" class="ax_default text_field">
        <input id="date" name="date" type="text"  placeholder="出版日期" value="${books.date}" >
      </div>

      <!-- Unnamed (矩形) -->
      <div id="u28" class="ax_default _二级标题">
          <div id="u28_div" class=""></div>
          <div id="u28_text" class="text ">
          <p><span><label for="sort">所属分类</label></span></p>
        </div>
      </div>

      <!-- Unnamed (文本框) -->
      <div id="u29" class="ax_default text_field">
        <input id="sort" name="sort" type="text" placeholder="所属分类" value="${books.sort}" >
      </div>

      <!-- Unnamed (矩形) -->
      <div id="u30" class="ax_default _二级标题">
          <div id="u30_div" class=""></div>
          <div id="u30_text" class="text ">
          <p><span><label for="price">价格</label></span></p>
        </div>
      </div>

      <!-- Unnamed (文本框) -->
      <div id="u31" class="ax_default text_field">
        <input id="price" name="price" type="number" step="0.01" placeholder="价格" value="${books.price}" >
      </div>

      <script src="ziyuan/resources/scripts/axure/ios.js"></script>
  </form>
  </body>
</html>
