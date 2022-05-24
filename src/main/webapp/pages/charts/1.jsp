<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <script type="text/javascript" src="/static/lib/jquery/1.9.1/jquery.min.js"></script>
    <script type="text/javascript" src="/static/h-ui/js/echarts.js" charset="UTF-8"></script>
</head>


<body>
<!-- 为 ECharts 准备一个定义了宽高的 DOM -->
<div id="main" style="width: 90%;height:600px;"></div>

<script type="text/javascript">
    var chartDom = document.getElementById('main');
    $.ajax({
        type: "GET",
        url: "/charts/getSumData",
        dataType: 'json',
        success: function (data) {
            var myChart = echarts.init(chartDom);
            var option = {
                title: {
                    text: '加入购物车最多的5个商品类型',
                    left: 'center'
                },
                legend: {
                    top: 'bottom'
                },
                toolbox: {
                    show: true,
                    feature: {
                        mark: { show: true },
                        dataView: { show: true, readOnly: false },
                        restore: { show: true },
                        saveAsImage: { show: true }
                    }
                },
                series: [
                    {
                        name: 'Nightingale Chart',
                        type: 'pie',
                        radius: [50, 250],
                        center: ['50%', '50%'],
                        roseType: 'area',
                        itemStyle: {
                            borderRadius: 8
                        },
                        data: data

                    }
                ]
            };

            myChart.setOption(option);
        }
    })

</script>
</body>
</html>