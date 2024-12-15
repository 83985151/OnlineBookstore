<%@ page import="java.util.List" %>
<%@ page import="com.bookshop.bean.Books" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="m" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
  <head>
    <title>管理员订单管理</title>
    <meta http-equiv="X-UA-Compatible" content="IE=edge"/>
    <meta http-equiv="content-type" content="text/html; charset=utf-8"/>
    <link href="ziyuan/resources/css/axure_rp_page.css" type="text/css" rel="stylesheet"/>
    <link href="ziyuan/data/styles.css" type="text/css" rel="stylesheet"/>
    <link href="ziyuan/files/管理员订单管理/styles.css" type="text/css" rel="stylesheet"/>
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
    <script src="ziyuan/files/管理员订单管理/data.js"></script>
    <script type="text/javascript">
      $axure.utils.getTransparentGifPath = function() { return 'resources/images/transparent.gif'; };
      $axure.utils.getOtherPath = function() { return 'resources/Other.html'; };
      $axure.utils.getReloadPath = function() { return 'resources/reload.html'; };
    </script>
  </head>
  <body>
  <table>
    <div id="base" class="">

      <!-- Unnamed (矩形) -->
      <div id="u72" class="ax_default box_1">
        <div id="u72_div" class=""></div>
        <div id="u72_text" class="text " style="display:none; visibility: hidden">
          <p></p>
        </div>
      </div>

      <!-- Unnamed (矩形) -->
      <div id="u73" class="ax_default _一级标题">
        <div id="u73_div" class=""></div>
        <div id="u73_text" class="text ">
          <p><span>用户订单管理</span></p>
        </div>
      </div>

      <!-- Unnamed (矩形) -->
      <div id="u74" class="ax_default box_1">
        <div id="u74_div" class=""></div>
        <div id="u74_text" class="text " style="display:none; visibility: hidden">
          <p><tbody id="userorderlist" style="position:relative;top: 350px;left: 240px;right: 800px;bottom: 100px">
          <m:forEach items="${userorderList}" var="userorder">
            <tr>
              <td>${userorder.bookname}</td>
              <td>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;${userorder.oid}</td>
              <td>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;${userorder.price}${userorder.payment}</td>
              <td>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                <a href="pay.jsp">付款</a>&nbsp;
                <a href="delOrder?oid=${userorder.oid}">删除</a>
              </td>
            </tr>
          </m:forEach>
          </tbody></p>
        </div>
      </div>

      <!-- Unnamed (矩形) -->
      <div id="u75" class="ax_default box_1">
        <div id="u75_div" class=""></div>
        <div id="u75_text" class="text " style="display:none; visibility: hidden">
          <p></p>
        </div>
      </div>

      <!-- Unnamed (矩形) -->
      <div id="u76" class="ax_default box_1">
        <div id="u76_div" class=""></div>
        <div id="u76_text" class="text " style="display:none; visibility: hidden">
          <p></p>
        </div>
      </div>

      <!-- Unnamed (矩形) -->
      <a href="userPage.jsp">
        <div id="u77" class="ax_default button">
          <p><span><input type="button" style=“size:10px;width:110px;height:30px;background-color:lightgray “ value="返回首页"></span></p>
        </div>
      </a>

      <!-- Unnamed (矩形) -->
      <div id="u78" class="ax_default _二级标题">
        <div id="u78_div" class=""></div>
        <div id="u78_text" class="text ">
          <p><span>请输入您想查看的订单书名：</span></p>
        </div>
      </div>

      <!-- Unnamed (文本框) -->
      <form action="seachOrderByBookname" method="post">
        <div id="u79" class="ax_default text_field">
          <div id="u79_div" class=""></div>
          <input id="u79_input" type="text" name="keyword" value="" class="u79_input"/>
        </div>
        <!-- Unnamed (矩形) -->
        <div id="u85" class="ax_default button">
          <div id="u85_text" class="text ">
            <p><span><input type="submit" style=“size:10px;width:80px;height:30px;background-color:ghostwhite “ value="搜索"></span></p>
          </div>
        </div>
      </form>

      <!-- Unnamed (矩形) -->
      <div id="u80" class="ax_default box_1">
        <div id="u80_div" class=""></div>
        <div id="u80_text" class="text " style="display:none; visibility: hidden">
          <p></p>
        </div>
      </div>

      <thead>
      <tr>
      <!-- Unnamed (矩形) -->
        <th>
      <div id="u81" class="ax_default _二级标题">
        <div id="u81_div" class=""></div>
        <div id="u81_text" class="text ">
          <p><span>图书名</span></p>
        </div>
      </div>
        </th>

      <!-- Unnamed (矩形) -->
        <th>
      <div id="u82" class="ax_default _二级标题">
        <div id="u82_div" class=""></div>
        <div id="u82_text" class="text ">
          <p><span>价格</span></p>
        </div>
      </div>
        </th>

      <!-- Unnamed (矩形) -->
        <th>
      <div id="u83" class="ax_default _二级标题">
        <div id="u83_div" class=""></div>
        <div id="u83_text" class="text ">
          <p><span>操作</span></p>
        </div>
      </div>
        </th>

      <!-- Unnamed (矩形) -->
        <th>
      <div id="u84" class="ax_default _二级标题">
        <div id="u84_div" class=""></div>
        <div id="u84_text" class="text ">
          <p><span>订单编号</span></p>
        </div>
      </div>
        </th>
      </tr>
      </thead>
    </div>
  </table>
  </body>
</html>
