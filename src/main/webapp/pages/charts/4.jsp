<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <script type="text/javascript" src="/static/lib/jquery/1.9.1/jquery.min.js" charset="UTF-8"></script>
    <script type="text/javascript" src="/static/h-ui/js/echarts.js" charset="UTF-8"></script>
</head>

<body>
<!-- 为 ECharts 准备一个定义了宽高的 DOM -->
<div id="main" style="width: 90%;height:650px;"></div>

<script type="text/javascript">
    var chartDom = document.getElementById('main');
    $.ajax({
        type: "GET",
        url: "/charts/getCountData",
        dataType: 'json',
        success: function (data) {
            var myChart = echarts.init(chartDom);
            var option;

            option = {
                title: {
                    text: '男顾客加购商品中，销量数和评价数之和最多的10个商品',
                    left: 'center'
                },
                tooltip: {
                    trigger: 'item'
                },
                legend: {
                    left: 'center',
                    bottom: 20
                },
                series: [
                    {
                        name: '总数',
                        type: 'pie',
                        radius: '50%',
                        data: data,
                        emphasis: {
                            itemStyle: {
                                shadowBlur: 10,
                                shadowOffsetX: 0,
                                shadowColor: 'rgba(0, 0, 0, 0.5)'
                            }
                        }
                    }
                ]
            };

            option && myChart.setOption(option);
        }
    })


</script>
</body>
</html>