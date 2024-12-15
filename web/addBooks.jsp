<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
  <head>
    <title>添加图书信息</title>
    <meta http-equiv="X-UA-Compatible" content="IE=edge"/>
    <meta http-equiv="content-type" content="text/html; charset=utf-8"/>
    <link href="ziyuan(3)/resources/css/axure_rp_page.css" type="text/css" rel="stylesheet"/>
    <link href="ziyuan(3)/files/添加图书信息/styles.css" type="text/css" rel="stylesheet"/>
    <script src="ziyuan(3)/resources/scripts/jquery-3.2.1.min.js"></script>
    <script src="ziyuan(3)/resources/scripts/axure/axQuery.js"></script>
    <script src="ziyuan(3)/resources/scripts/axure/globals.js"></script>
    <script src="ziyuan(3)/resources/scripts/axutils.js"></script>
    <script src="ziyuan(3)/resources/scripts/axure/annotation.js"></script>
    <script src="ziyuan(3)/resources/scripts/axure/axQuery.std.js"></script>
    <script src="ziyuan(3)/resources/scripts/axure/doc.js"></script>
    <script src="ziyuan(3)/resources/scripts/messagecenter.js"></script>
    <script src="ziyuan(3)/resources/scripts/axure/events.js"></script>
    <script src="ziyuan(3)/resources/scripts/axure/recording.js"></script>
    <script src="ziyuan(3)/resources/scripts/axure/action.js"></script>
    <script src="ziyuan(3)/resources/scripts/axure/expr.js"></script>
    <script src="ziyuan(3)/resources/scripts/axure/geometry.js"></script>
    <script src="ziyuan(3)/resources/scripts/axure/flyout.js"></script>
    <script src="ziyuan(3)/resources/scripts/axure/model.js"></script>
    <script src="ziyuan(3)/resources/scripts/axure/repeater.js"></script>
    <script src="ziyuan(3)/resources/scripts/axure/sto.js"></script>
    <script src="ziyuan(3)/resources/scripts/axure/utils.temp.js"></script>
    <script src="ziyuan(3)/resources/scripts/axure/variables.js"></script>
    <script src="ziyuan(3)/resources/scripts/axure/drag.js"></script>
    <script src="ziyuan(3)/resources/scripts/axure/move.js"></script>
    <script src="ziyuan(3)/resources/scripts/axure/visibility.js"></script>
    <script src="ziyuan(3)/resources/scripts/axure/style.js"></script>
    <script src="ziyuan(3)/resources/scripts/axure/adaptive.js"></script>
    <script src="ziyuan(3)/resources/scripts/axure/tree.js"></script>
    <script src="ziyuan(3)/resources/scripts/axure/init.temp.js"></script>
    <script src="ziyuan(3)/resources/scripts/axure/legacy.js"></script>
    <script src="ziyuan(3)/resources/scripts/axure/viewer.js"></script>
    <script src="ziyuan(3)/resources/scripts/axure/math.js"></script>
    <script src="ziyuan(3)/resources/scripts/axure/jquery.nicescroll.min.js"></script>
    <script src="ziyuan(3)/files/添加图书信息/data.js"></script>
    <script type="text/javascript">
      $axure.utils.getTransparentGifPath = function() { return 'resources/images/transparent.gif'; };
      $axure.utils.getOtherPath = function() { return 'resources/Other.html'; };
      $axure.utils.getReloadPath = function() { return 'resources/reload.html'; };
    </script>
  </head>
  <body>
  <form action="addBooks" method="post">
  <div id="u33" class="ax_default box_1">
    <div id="u33_div" class=""></div>
    <div id="u33_text" class="text " style="display:none; visibility: hidden">
      <p></p>
    </div>
  </div>

  <!-- Unnamed (矩形) -->
  <div id="u34" class="ax_default box_1">
    <div id="u34_div" class=""></div>
    <div id="u34_text" class="text " style="display:none; visibility: hidden">
      <p></p>
    </div>
  </div>

  <!-- Unnamed (矩形) -->
  <div id="u35" class="ax_default _一级标题">
    <div id="u35_div" class=""></div>
    <div id="u35_text" class="text ">
      <p><span>新增图书</span></p>
    </div>
  </div>

  <!-- Unnamed (矩形) -->
    <div id="u36" class="ax_default button">
        <p><span><input type="submit" style=“size:10px;width:110px;height:30px;background-color:mediumseagreen “ value="确认添加"></span></p>
    </div>

  <!-- Unnamed (矩形) -->
  <a href="BMS.jsp">
    <div id="u37" class="ax_default button">
        <p><span><input type="button" style=“size:10px;width:110px;height:30px;background-color:darkorange “ value="返回"></span></p>
    </div>
  </a>

  <!-- Unnamed (矩形) -->
  <div id="u38" class="ax_default _二级标题">
    <div id="u38_div" class=""></div>
    <div id="u38_text" class="text ">
      <p><span><label for="bookname">图书名</label></span></p>
    </div>
  </div>

  <!-- Unnamed (文本框) -->
  <div id="u39" class="ax_default text_field">
    <input id="bookname" name="bookname" type="text"  placeholder="图书名" value="" >
  </div>

  <!-- Unnamed (矩形) -->
  <div id="u40" class="ax_default _二级标题">
    <div id="u40_div" class=""></div>
    <div id="u40_text" class="text ">
      <p><span><label for="author">图书作者</label></span></p>
    </div>
  </div>

  <!-- Unnamed (文本框) -->
  <div id="u41" class="ax_default text_field">
    <input id="author" name="author" type="text"  placeholder="图书作者" value="" >
  </div>

  <!-- Unnamed (矩形) -->
  <div id="u42" class="ax_default _二级标题">
    <div id="u42_div" class=""></div>
    <div id="u42_text" class="text ">
      <p><span><label for="date">出版时间</label></span></p>
    </div>
  </div>

  <!-- Unnamed (文本框) -->
  <div id="u43" class="ax_default text_field">
    <input id="date" name="date" type="text"  placeholder="出版日期" value="" >
  </div>

  <!-- Unnamed (矩形) -->
  <div id="u45" class="ax_default _二级标题">
    <div id="u45_div" class=""></div>
    <div id="u45_text" class="text ">
      <p><span><label for="sort">所属分类</label></span></p>
    </div>
  </div>

  <!-- Unnamed (文本框) -->
  <div id="u46" class="ax_default text_field">
    <input id="sort" name="sort" type="text" placeholder="所属分类" value="" >
  </div>

  <!-- Unnamed (矩形) -->
  <div id="u47" class="ax_default _二级标题">
    <div id="u47_div" class=""></div>
    <div id="u47_text" class="text ">
      <p><span><label for="price">价格</label></span></p>
    </div>
  </div>

  <!-- Unnamed (文本框) -->
  <div id="u48" class="ax_default text_field">
    <input id="price" name="price" type="number" step="0.01" placeholder="价格" value="" >
  </div>

  </div>
    <script src="ziyuan(3)/resources/scripts/axure/ios.js"></script>
  </form>
  </body>
</html>
