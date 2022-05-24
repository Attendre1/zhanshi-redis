﻿<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" charset="UTF-8" />
    <title>数据可视化</title>
    <link rel="stylesheet" href="/css/index.css" />
</head>
<body>
<!-- 头部 -->
<header>
    <h1>天猫商城数据可视化展示</h1>
    <div class="show-time"></div>
    <script>
        var t = null;
        t = setTimeout(time, 1000); //开始运行
        function time() {
            clearTimeout(t); //清除定时器
            dt = new Date();
            var y = dt.getFullYear();
            var mt = dt.getMonth() + 1;
            var day = dt.getDate();
            var h = dt.getHours(); //获取时
            var m = dt.getMinutes(); //获取分
            var s = dt.getSeconds(); //获取秒
            document.querySelector(".show-time").innerHTML =
                "当前时间：" +
                y +
                "年" +
                mt +
                "月" +
                day +
                "日-" +
                h +
                "时" +
                m +
                "分" +
                s +
                "秒";
            t = setTimeout(time, 1000); //设定定时器，循环运行
        }
    </script>
</header>

<!-- 页面主体 -->
<section class="mainbox">
    <!-- 左侧盒子 -->
    <div class="column">
        <div class="panel bar">
            <h2>柱形图-加入购物车次数最多</h2>
            <!-- 图表放置盒子 -->
            <div class="chart"></div>
            <!-- 伪元素绘制盒子下边角 -->
            <div class="panel-footer"></div>
        </div>
        <div class="panel line">
            <h2>折线图-不同性别查询
                <a class="a-active" href="javascript:;">男</a>
                <a href="javascript:;">女</a>
            </h2>
            <div class="chart"></div>
            <div class="panel-footer"></div>
        </div>
        <div class="panel pie">
            <h2>饼形图-销售数和评价数最高</h2>
            <div class="chart"></div>
            <div class="panel-footer"></div>
        </div>
    </div>
    <!-- 中间盒子 -->
    <div class="column">
        <!-- 头部 no模块 -->
        <div class="no">
            <div class="no-hd">
                <ul>
                    <li>卧龙雏凤</li>
                    <li>攻程狮队</li>
                </ul>
            </div>
            <div class="no-bd">
                <ul>
                    <li>代码筑城</li>
                    <li>无所不能</li>
                </ul>
            </div>
        </div>
        <!-- map模块 -->
        <div class="map">
            <div class="map1"></div>
            <div class="map2"></div>
            <div class="map3"></div>
            <div class="chart"></div>
        </div>
    </div>
    <!-- 右侧盒子 -->
    <div class="column">
        <div class="panel bar2">
            <h2>柱形图-销售价格最高</h2>
            <div class="chart"></div>
            <div class="panel-footer"></div>
        </div>
        <div class="panel line2">
            <h2>折线图-每天销售价格最高</h2>
            <div class="chart"></div>
            <div class="panel-footer"></div>
        </div>
        <div class="panel pie2">
            <h2>饼形图-加入购物车次数最多</h2>
            <div class="chart"></div>
            <div class="panel-footer"></div>
        </div>
    </div>
</section>

<script src="/js/flexible.js" charset="UTF-8"></script>
<script src="/static/h-ui/js/echarts.js" charset="UTF-8"></script>
<script src="/static/lib/jquery/1.9.1/jquery.min.js" charset="UTF-8"></script>
<!-- 引入china.js 完成地图模块 -->
<script src="/js/china.js" charset="UTF-8"></script>
<script src="/js/index.js" charset="UTF-8"></script>
</body>
</html>
