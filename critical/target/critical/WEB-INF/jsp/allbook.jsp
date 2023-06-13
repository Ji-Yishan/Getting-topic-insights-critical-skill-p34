<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>电影关键词词云图</title>
    <script src="https://cdn.bootcdn.net/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
    <script src="https://cdn.bootcdn.net/ajax/libs/echarts/5.2.2/echarts.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/echarts-wordcloud@2.0.0/dist/echarts-wordcloud.min.js"></script>
    <style>
        body {
            font-family: Arial, sans-serif;
            margin: 0;
            padding: 0;
        }
        #wordcloud {
            margin: 50px auto;
        }
        h1, p {
            text-align: center;
        }
    </style>
</head>
<body>
<h1  id="t1"></h1>
<p id="p1"></p>
<div id="wordcloud" style="width: 100%; height: 600px;"></div>

<script>

    $(document).ready(function () {

        $.ajax({
            url: '${pageContext.request.contextPath}/p34/book/showTop10',
            type: 'GET',
            dataType: 'json',
            success: function(data) {
                console.log(data);
                // 电影关键词
                var movieKeywords = [];
                if(data){
                    movieKeywords=[];
                    for (var i = 0; i < data.length; i++) {
                        movieKeywords.push( { name: data[i].name, value: data[i].times })
                    }
                }

                // 初始化ECharts实例
                var chart = echarts.init(document.getElementById("wordcloud"));

                // 配置ECharts选项
                var option = {
                    series: [
                        {
                            type: "wordCloud",
                            gridSize: 20,
                            sizeRange: [50, 200],
                            rotationRange: [0, 0],
                            shape: "pentagon",
                            width: "100%",
                            height: "100%",
                            textStyle: {
                                color: function () {
                                    var colors = [
                                        "#f44329", "#de71a6", "#c073cb", "#a790d7", "#3f51b5",
                                        "#70ade1", "#3c96bd", "#4cc4d7", "#489f97", "#4caf50",
                                        "#8bc34a", "#bac25c", "#dacb4f", "#f5c32c", "#ff9800",
                                        "#b76e57", "#8d5847", "#9f9d9d", "#607d8b"
                                    ];
                                    return colors[Math.floor(Math.random() * colors.length)];
                                },
                            },
                            data: movieKeywords,
                        },
                    ],
                };

                // 使用配置的选项渲染图表
                chart.setOption(option);

            },
            error: function(xhr, textStatus, errorThrown) {
                // 请求失败时的回调函数
                console.log('Error: ' + errorThrown);
            }
        });






    });


    function getUrlParam(name) {
        var reg = new RegExp("(^|&)" + name + "=([^&]*)(&|$)");
        var r = window.location.search.substr(1).match(reg);
        if (r != null) return unescape(r[2]);
        return null;
    }


</script>
</body>
</html>
