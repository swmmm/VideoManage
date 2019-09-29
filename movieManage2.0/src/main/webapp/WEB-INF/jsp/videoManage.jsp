<%--
  Created by IntelliJ IDEA.
  User: swmmmm
  Date: 2018/10/5
  Time: 14:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + "/";
%>

<html lang="zh_CN">
<head>
    <meta name="viewport" content="width=device-width, initial-scale=1"/>
    <meta charset="UTF-8"/>
    <title>影片后台管理</title>
    <link rel="stylesheet" type="text/css" href="<%=basePath%>static/css/bootstrap.css">
    <style>
        body{
            background:#f8f8f8;
        }
        .form-control label{
            font-weight: normal;
            font-size: 16px;
        }
        #sidebar{
            float: left;
            width: 15%;
        }
        #content{
            float: left;
            width: 85%;
            padding: 0 25px;
        }
        .panel-title{
            font-size: 30px;
        }
        #showAddmodalBtn{
            float: right;
        }
        #addTags .form-control{
            height: auto;
        }
        #addTags .form-control label{
            margin-right: 6px;
        }
        #editTags .form-control{
            height: auto;
        }
        #editTags .form-control label{
            margin-right: 6px;
        }
    </style>
</head>
<body>
<nav class="navbar navbar-default">
    <div class="container-fluid">
        <div class="navbar-header">
            <a class="navbar-brand" href="#">VideoManage</a>
        </div>
        <div>
            <ul class="nav navbar-nav navbar-right">
                <li class="dropdown">
                    <a href="#" class="dropdown-toggle" data-toggle="dropdown">
                        <span class="glyphicon glyphicon-user">${loginUser}</span>
                        <span class="caret"></span>
                    </a>
                    <ul class="dropdown-menu">
                        <li><a href=""><span class="glyphicon glyphicon-user">User Profile</span></a></li>
                        <li class="divider"></li>
                        <li><a href="/logout"><span class="glyphicon glyphicon-log-out">Logout</span></a></li>
                    </ul>
                </li>
            </ul>
        </div>
    </div>
</nav>
<div id="sidebar">
    <ul class="nav nav-pills nav-stacked">
        <li class="active"><a href="">Video Manage</a></li>
        <li><a href="">User Manage</a></li>
        <li><a href="">Admin Manage</a></li>
    </ul>
</div>

<div id="content">
    <div class="panel panel-primary">
        <div class="panel-heading">
            <h6 class="panel-title">Video Infomation</h6>
        </div>
        <div class="panel-body">
            <form class="form-inline">
                <div class="form-group">
                    <input type="text" class="form-control" placeholder="VideoName">
                    <select class="form-control">
                        <option>Category</option>
                        <option>a</option>
                        <option>b</option>
                        <option>c</option>
                        <option>d</option>
                    </select>
                    <button class="btn btn-default" type="button">Search</button>
                </div>
                <button id="showAddmodalBtn" class="btn btn-primary" type="button" data-toggle="modal" data-target="#videoAddModal">添加影片</button>
            </form>
            <table class="table table-hover table-bordered">
                <thead>
                <tr>
                    <th></th>
                    <th>编号</th>
                    <th>名称</th>
                    <th>类别</th>
                    <th>类型</th>
                    <th>国家</th>
                    <th>上映时间</th>
                    <th>操作</th>
                </tr>
                </thead>
                <tbody>
                <c:forEach items="${Videos}" var="video">
                    <tr>
                        <td><input type="checkbox"  value="${video["videoId"]}"></td>
                        <td>${video["videoId"]}</td>
                        <td>${video["videoName"]}</td>
                        <td>${video["category"]}</td>
                        <td><c:forEach items="${video['tags']}" var="tag">${tag["tagName"]}  </c:forEach></td>
                        <td>${video["nation"]}</td>
                        <td><fmt:formatDate value="${video['showdate']}" pattern="yyyy-MM-dd"/> </td>
                        <td>
                            <a href="" class="btn btn-primary "data-toggle="modal"  data-target="#videoEditModal" onclick="getVideo(${video["videoId"]})">详细</a>
                            <a href="" class="btn btn-danger" onclick="">删除</a>
                        </td>
                    </tr>
                </c:forEach>
                </tbody>
            </table>
        </div>
    </div>
</div>

    <!-- <%--影片详细信息编辑对话框--%> -->
    <div class="modal fade" id="videoEditModal">
    <div class="modal-dialog modal-lg">
        <div class="modal-content">
            <div class="modal-header">
                <h4 class="modal-title">影片详细信息</h4>
                <button type="button" class="close" data-dismiss="modal"><span aria-hidden="true">&times</span></button>
            </div>
            <div class="modal-body">
                <form id="videoEditForm" role="form" class="form-horizontal">
                    <input type="hidden" id="editVideoId" name="videoId">
                    <div class="form-group">
                        <label for="editVideoName" class="col-sm-2 control-label">影片名称</label>
                        <div class="col-sm-10" >
                            <input type="text" id="editVideoName" name="videoName" class="form-control">
                        </div>
                    </div>
                    <div class="form-group">
                        <label for="editNation" class="col-sm-2 control-label">地区</label>
                        <div class="col-sm-10" >
                            <input type="text" id="editNation" name="nation" class="form-control">
                        </div>
                    </div>
                    <div class="form-group">
                        <label for="editLanguage" class="col-sm-2 control-label">语言</label>
                        <div class="col-sm-10" >
                            <input type="text" id="editLanguage" name="language" class="form-control">
                        </div>
                    </div>
                    <div class="form-group">
                        <label for="editShowdate" class="col-sm-2 control-label">首映时间</label>
                        <div class="col-sm-10" >
                            <input type="date" id="editShowdate" name="showdate" class="form-control">
                        </div>
                    </div>
                    <div class="form-group">
                        <label for="editTVstation" class="col-sm-2 control-label">电视台</label>
                        <div class="col-sm-10" >
                            <input type="text" id="editTVstation" name="tvstation" class="form-control">
                        </div>
                    </div>
                    <div class="form-group">
                        <label for="editCategory" class="col-sm-2 control-label">类别</label>
                        <div class="col-sm-10" >
                            <input type="text" id="editCategory" name="category" class="form-control">
                        </div>
                    </div>
                    <div class="form-group">
                        <label for="editTags" class="col-sm-2 control-label">类型</label>
                        <div id="editTags" class="col-sm-10">
                            <div class="form-control">
                                <c:forEach items="${Tags}" var="tag">
                                    <label><input type="checkbox" name="tagName" value="${tag['tagName']}">${tag['tagName']}</label>
                                </c:forEach>
                            </div>
                        </div>
                    </div>
                    <div class="form-group">
                        <label for="addAlias" class="col-sm-2 control-label">别名</label>
                        <div class="col-sm-10" >
                            <input type="text" id="editAlias" name="alias" class="form-control">
                        </div>
                    </div>
                    <div class="form-group">
                        <label for="addScreenwriter" class="col-sm-2 control-label">编剧</label>
                        <div class="col-sm-10" >
                            <input type="text" id="editScreenwriter" name="screenwriter" class="form-control">
                        </div>
                    </div>
                    <div class="form-group">
                        <label for="addDirector" class="col-sm-2 control-label">导演</label>
                        <div class="col-sm-10" >
                            <input type="text" id="editDirector" name="director" class="form-control">
                        </div>
                    </div>
                    <div class="form-group">
                        <label for="addLeadactor" class="col-sm-2 control-label">主演</label>
                        <div class="col-sm-10" >
                            <input type="text" id="editLeadactor" name="leadactor" class="form-control">
                        </div>
                    </div>
                    <div class="form-group">
                        <label for="addEpisodes" class="col-sm-2 control-label">集数</label>
                        <div class="col-sm-10" >
                            <input type="text" id="editEpisodes" name="episodes" class="form-control">
                        </div>
                    </div>
                    <div class="form-group">
                        <label for="addStatu" class="col-sm-2 control-label">状态</label>
                        <div class="col-sm-10" >
                            <input type="text" id="editStatu" name="statu" class="form-control">
                        </div>
                    </div>
                </form>
            </div>
            <div class="modal-footer">
                <div id="editBtn">
                    <button  type="button" class="btn btn-primary" onclick="editVideo()">编辑</button>
                </div>
                <div id="updateBtnGroup" hidden>
                    <button type="button" class="btn btn-primary" onclick="updateVideo()">修改</button>
                    <button type="button" class="btn btn-primary" data-dismiss="modal" onclick="cancelEdit()">取消</button>
                </div>
            </div>
        </div>
    </div>
</div>
    <!-- <%--影片添加对话框--%> -->
    <div class="modal fade" id="videoAddModal">
        <div class="modal-dialog modal-lg">
            <div class="modal-content">
                <div class="modal-header">
                    <h4 class="modal-title">影片信息添加</h4>
                    <button type="button" class="close" data-dismiss="modal"><span aria-hidden="true">&times</span></button>
                </div>
                <div class="modal-body">
                    <form id="videoAddForm" role="form" class="form-horizontal">
                        <div class="form-group">
                            <label for="addVideoName" class="col-sm-2 control-label">影片名称</label>
                            <div class="col-sm-10" >
                                <input type="text" id="addVideoName" name="videoName" class="form-control">
                            </div>
                        </div>
                        <div class="form-group">
                            <label for="addNation" class="col-sm-2 control-label">地区</label>
                            <div class="col-sm-10" >
                                <input type="text" id="addNation" name="nation" class="form-control">
                            </div>
                        </div>
                        <div class="form-group">
                            <label for="addLanguage" class="col-sm-2 control-label">语言</label>
                            <div class="col-sm-10" >
                                <input type="text" id="addLanguage" name="language" class="form-control">
                            </div>
                        </div>
                        <div class="form-group">
                            <label for="addShowdate" class="col-sm-2 control-label">首映时间</label>
                            <div class="col-sm-10" >
                                <input type="date" id="addShowdate" name="showdate" class="form-control">
                            </div>
                        </div>
                        <div class="form-group">
                            <label for="addTVstation" class="col-sm-2 control-label">电视台</label>
                            <div class="col-sm-10" >
                                <input type="text" id="addTVstation" name="tvstation" class="form-control">
                            </div>
                        </div>
                        <div class="form-group">
                            <label for="addCategory" class="col-sm-2 control-label">类别</label>
                            <div class="col-sm-10" >
                                <input type="text" id="addCategory" name="category" class="form-control">
                            </div>
                        </div>
                        <div class="form-group">
                            <label for="addTags" class="col-sm-2 control-label">类型</label>
                            <div  id="addTags" class="col-sm-10">
                                <div class="form-control">
                                    <c:forEach items="${Tags}" var="tag">
                                        <label><input type="checkbox" name="tagId" value="${tag['tagId']}">${tag['tagName']}</label>
                                    </c:forEach>
                                </div>
                            </div>
                        </div>
                        <div class="form-group">
                            <label for="addAlias" class="col-sm-2 control-label">别名</label>
                            <div class="col-sm-10" >
                                <input type="text" id="addAlias" name="alias" class="form-control">
                            </div>
                        </div>
                        <div class="form-group">
                            <label for="addScreenwriter" class="col-sm-2 control-label">编剧</label>
                            <div class="col-sm-10" >
                                <input type="text" id="addScreenwriter" name="screenwriter" class="form-control">
                            </div>
                        </div>
                        <div class="form-group">
                            <label for="addDirector" class="col-sm-2 control-label">导演</label>
                            <div class="col-sm-10" >
                                <input type="text" id="addDirector" name="director" class="form-control">
                            </div>
                        </div>
                        <div class="form-group">
                            <label for="addLeadactor" class="col-sm-2 control-label">主演</label>
                            <div class="col-sm-10" >
                                <input type="text" id="addLeadactor" name="leadactor" class="form-control">
                            </div>
                        </div>
                        <div class="form-group">
                            <label for="addEpisodes" class="col-sm-2 control-label">集数</label>
                            <div class="col-sm-10" >
                                <input type="text" id="addEpisodes" name="episodes" class="form-control">
                            </div>
                        </div>
                        <div class="form-group">
                            <label for="addStatu" class="col-sm-2 control-label">状态</label>
                            <div class="col-sm-10" >
                                <input type="text" id="addStatu" name="statu" class="form-control">
                            </div>
                        </div>
                    </form>
                </div>
                <div class="modal-footer">
                    <button type="button" class="btn btn-primary" onclick="addVideo()">添加</button>
                </div>
            </div>
        </div>
    </div>


    <script type="text/javascript" src="<%=basePath%>static/js/jquery-3.1.1.min.js"></script>
    <script type="text/javascript" src="<%=basePath%>static/js/bootstrap.js"></script>

    <script type="text/javascript">
        function addFormCheck() {
            if (!$("#addVideoName").val()) {
                alert("请输入影片名称");
                return false;
            }
            if (!$("#addNation").val()) {
                alert("请输入国家/地区");
                return false;
            }
            if (!$("#addLanguage").val()){
                alert("请输入语言");
                return false;
            }
            if (!$("#addAlias").val()) {
                alert("请输入影片别名");
                return false;
            }
            if (!$("#addDirector").val()) {
                alert("请输入影片导演");
                return false;
            }
            if (!$("#addLeadactor").val()) {
                alert("请输入影片主演");
                return false;
            }
            if (!$("#addScreenwriter").val()) {
                alert("请输入影片编剧");
                return false;
            }
            if (!$("#addShowdate").val()) {
                alert("请输入影片上映日期");
                return false;
            }
            if (!$("#addStatu").val()) {
                alert("请输入影片状态");
                return false;
            }
            if (!$("#addTVstation").val()) {
                alert("请输入影片电视台");
                return false;
            }
            if (!$("#addEpisodes").val()) {
                alert("请输入影片集数");
                return false;
            }
            if (!$("#addCategory").val()) {
                alert("请输入影片类型");
                return false;
            }
            return true;
        }
        function addVideo() {
            if(addFormCheck()){
                $.post("/movie/add",$("#videoAddForm").serialize(),function (data) {
                    alert("添加成功"+$("#videoAddForm").serialize());
                    window.location.reload();
                });
            }
        }
        // 删除影片方法
        function deleteVideo(v_id) {
            if (confirm("确认要删除该电影吗？")) {
                $.post("<%=basePath%>deleteVideo", {'v_id': v_id}, function (data) {
                    alert(data);
                    window.location.reload();
                })
            }
        }

        // 影片修改方法
        function editVideo() {
            $("#videoEditForm").find("input").attr("disabled",false);
            $("#editBtn").attr("hidden",true);
            $("#updateBtnGroup").attr("hidden",false);
        }
        function cancelEdit() {
            $("#editBtn").attr("hidden",false);
            $("#updateBtnGroup").attr("hidden",true);
        }
        function editFormCheck() {
            if (!$("#editVideoName").val()) {
                alert("请输入影片名称");
                return false;
            }
            if (!$("#editNation").val()) {
                alert("请输入国家/地区");
                return false;
            }
            if (!$("#editLanguage").val()){
                alert("请输入语言");
                return false;
            }
            if (!$("#editAlias").val()) {
                alert("请输入影片别名");
                return false;
            }
            if (!$("#editDirector").val()) {
                alert("请输入影片导演");
                return false;
            }
            if (!$("#editLeadactor").val()) {
                alert("请输入影片主演");
                return false;
            }
            if (!$("#editScreenwriter").val()) {
                alert("请输入影片编剧");
                return false;
            }
            if (!$("#editShowdate").val()) {
                alert("请输入影片上映日期");
                return false;
            }
            if (!$("#editStatu").val()) {
                alert("请输入影片状态");
                return false;
            }
            if (!$("#editTVstation").val()) {
                alert("请输入影片电视台");
                return false;
            }
            if (!$("#editEpisodes").val()) {
                alert("请输入影片集数");
                return false;
            }
            if (!$("#editCategory").val()) {
                alert("请输入影片类型");
                return false;
            }
            return true;
        }
        function updateVideo() {
            if (confirm("确认要修改该电影信息吗？")) {
                if (editFormCheck()){
                    $.post("/movie/update",$("#videoEditForm").serialize(),function (data) {
                        alert("修改电影成功!");
                        window.location.reload();
                    })
                }
            }

        }

        // 展示影片详情
        function getVideo(videoId) {
            $.ajax({
                type: "get",
                url: "/movie/edit",
                data: {'videoId': videoId},
                success: function (data) {
                    $("#editTags").find("input").each(function () {
                        $(this).attr("checked",false);
                    });
                    $("#editVideoId").val(data.videoId);
                    $("#editVideoName").val(data.videoName);
                    $("#editNation").val(data.nation);
                    $("#editLanguage").val(data.language);
                    $('#editAlias').val(data.alias);
                    $('#editDirector').val(data.director)
                    $('#editLeadactor').val(data.leadactor);
                    $("#editScreenwriter").val(data.screenwriter);
                    $("#editStatu").val(data.statu);
                    $("#editTVstation").val(data.tvstation);
                    $("#editEpisodes").val(data.episodes);
                    $("#editCategory").val(data.category);
                    $("#editShowdate").val(data.showdate);
                    var tags = data.tags;
                    for (var i=0; i<tags.length;i++){
                        $("#editTags").find("input[value="+tags[i].tagName+"]").attr("checked",true);
                    }
                    $("#videoEditForm").find("input").attr("disabled",true);
                }
            })
        }
    </script>
</body>
</html>
