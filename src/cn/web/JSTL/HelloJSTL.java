package cn.web.JSTL;

/**
 * Created by Taeyeon-Serenity on 2016/12/6.
 */
public class HelloJSTL {
    /*JSTL
    *     1.什么是JSTL
    *           JSTL是EL表达式的扩展（也就是说JSTL依赖EL），JSTL是标签语言
    *           使用JSTL需要导入jstl1.2的jar包
    *           导入标签库
    *               jar包
    *               在jsp页面中：<%@taglib prefix="前缀" uri="路径"%>
    *     2.JSTL标签库
    *           JSTL一共包含四大标签库
    *               core：核心标签库
    *               fmt：格式化标签库，日期、数字
    *               sql：数据库标签库，已过时
    *               xml：xml标签库，已过时
    *           core标签库常用标签 --> c标签
    *               1.out和set
    *                   *<c:out>：输出
    *                       >value：可以是字符串常亮，也可以是EL表达式
    *                       >default：当要输出的内容为null时，会输出default指定的值
    *                       >escapeXml：默认值为true，表示转义
    *                   *<c:set>：设置（创建域的属性）
    *                       >var：变量名
    *                       >value：变量值，可以是EL表达式
    *                       >scope：域，默认为page，可选值：page、request、session、application
    *               2.remove
    *                   *<remove>：删除域变量
    *                       >var：变量名
    *                       >scope：如果不给出scope，表示删除所有域中的该名称的变量，如果指定了域，那么只会删除该域中的该名称的变量
    *               3.url
    *                   *value：指定一个路径，它会在路径前面自动添加项目名
    *                        <c:url value="/index.jsp"/>，它会输出/JSTL/index.jsp
    *                   *子标签：<c:param>，用来给url后面添加参数，例如：
    *                       <c:url value="/index.jsp">
    *                           <c:param name="username" value="张三"/>   可以对参数进行url编码
    *                       </c:url>
    *                       结果为：/JSTL/index.jsp?username=
    *                   *var：指定变量名，一旦添加了这个属性，那么url标签就不会再输出到页面，而是把生成的url保存到域中
    *                   *scope：它与var一起使用，用来保存url
    *               4.if：对应java里面的if语句
    *                   <c:if test="布尔类型">...</c:if>，当test为真时，执行标签体内容
    *               5.choose：对应java里面的if/else if/.../else
    *                   例如：
    *                       <c:choose>
    *                           <c:when test="">...</c:when>
    *                           <c:when test="">...</c:when>
    *                           <c:when test="">...</c:when>
    *                           ...
    *                           <c:otherwise>...</c:otherwise>
    *                       </c:choose>
    *               6.forEach
    *                   它用来循环遍历数组、集合。
    *                   可以用计数方式来循环
    *                   计数方式：
    *                       for(int i = 0 ; i <= 10 ; i++){
    *                           ...
    *                       }
    *                       <c:forEach> var="i" begin="1" end="10">
    *                       </c:forEach>
    *                       属性：
    *                           *var：循环变量
    *                           *begin：设置循环变量从几开始
    *                           *end：设置循环变量到几结束
    *                           *step：设置步长，等同于java中的i++，或i+=2，step默认为1
    *                   用来输出数组和集合：
      *                     <c:forEach items="${strs}" var="str">
      *                         ${str} <br/>
      *                     </c:forEach>
      *                     等同于
      *                     for(String str : strs){
      *                         ...
      *                     }
      *                     属性：
      *                         *item：指定要循环谁，它可以是一个数组或一个集合
      *                         *var：把数组或集合中的每个元素赋值给var指定的变量
      *
      *                     循环状态：
      *                         可以使用varStatus来创建循环状态变量
      *                         循环状态变量有如下属性：
      *                             *count：循环元素的个数
      *                             *index：循环元素的下标
      *                             *first：是否为第一个元素
      *                             *last：是否为最后一个元素
      *                             *current：当前元素
      *                    <%
      *                         ArrayList<String> list=new ArrayList<String>();
      *                         list.add("一");
      *                         list.add("二");
      *                         list.add("三");
      *                         pageContext.setAttribute("list",list);
      *                    %>
      *                    <c:forEach items="${list}" var="ele" varStatus="vs">
      *                        ${vs.index} ${vs.count} ${vs.first} ${vs.last} ${vs.current} <br/>
      *                    </c:forEach>
      *
      *         fmt库
      *             它是格式化库
      *                 <fmt:formatDate value="" pattern=""/>
      *                     value：指定一个Date类型的变量
      *                     pattern：用来指定输出的模板，例如：yyyy-MM-dd HH:mm:ss
      *
      *                 <fmt:formatNumber value="${num1}" pattern="0.00"/>
      *                     保留小数点后2位，它会四舍五入，如果不足2位，以0补位
      *                 <fmt:formatNumber value="${num1}" pattern="#.##"/>
      *                     保留小数点后2位，它会四舍五入，如果不足2位，不补位
      *
      *
      *       自定义标签
        *       1.步骤
        *           *标签处理类（标签也是一个对象，那么就需要先有类）
        *           *tld文件，它是一个xml
        *           *页面中使用<%@ taglib%>来指定tld文件的位置
        *       2.标签处理类
    *               */
}
