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
        url: "/charts/getSexData",
        dataType: 'json',
        success: function (data) {
            var myChart = echarts.init(chartDom);
            var option;

            option = {
                title: {
                    text: '男性查询最多的三个商品类别',
                    left: 'center'
                },
                xAxis: {
                    type: 'category',
                    data: data.names
                },
                yAxis: {
                    type: 'value'
                },
                series: [
                    {
                        data: data.values,
                        type: 'line'
                    }
                ]
            };

            option && myChart.setOption(option);
        }
    })

</script>
</body>
</html>