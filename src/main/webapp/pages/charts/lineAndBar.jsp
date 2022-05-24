<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <script type="text/javascript" src="/static/lib/jquery/1.9.1/jquery.min.js"></script>
    <script type="text/javascript" src="/static/h-ui/js/echarts.js" charset="UTF-8"></script>
</head>
<body>

<!-- 为echarts准备一个容器Dom div -->
<div id="main" style="width: 90%;height:600px;"></div>

<!-- 开始写js -->
<script type="text/javascript">
    //获取eharts对象
    var myEcharts = echarts.init(document.getElementById("main"));

    $.ajax({
        type: "GET",
        url: "/charts/getMarketData",
        dataType: 'json',
        success: function (data) {
            //指定图表与配置的数据
            var option = {
                title: {
                    text: '加入购物车次数最多的商品',
                    target: 'self',
                    textStyle: {
                        color: 'black'
                    }
                },
                tooltip: {
                    show: true
                },
                toolbox: {
                    feature: {
                        dataView: {
                            show: true,
                            title: '数据视图',
                            lang: ['数据视图', '关闭', '刷新']
                        }
                    }
                },
                legend: {
                    // 强制设置图形为圆。
                    icon: 'circle',
                    // 设置文本为红色
                    textStyle: {
                        color: 'black'
                    }
                },
                xAxis: {
                    data: data.names
                },
                yAxis: {},
                series: [{
                    name: '次数',
                    type: 'line',
                    data: data.values,
                    markPoint: {
                        data: [{
                            name: "最大值",
                            type: "max"
                        }, {
                            name: "最小值",
                            type: "min"
                        }]
                    },
                    markLine: {
                        data: [{
                            name: '平均线',
                            // 支持 'average', 'min', 'max'
                            type: 'average'
                        }]
                    }
                }, {
                    type: 'bar',
                    data: data.values,

                }]
            };

            //放入到对象中
            myEcharts.setOption(option);
        }
    })

</script>
</body>
</html>