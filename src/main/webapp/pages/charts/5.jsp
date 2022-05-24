<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <meta name="content-type" content="text/html; charset=utf-8">

    <script type="text/javascript" src="/static/lib/jquery/1.9.1/jquery.min.js" charset="UTF-8"></script>
    <script type="text/javascript" src="/static/h-ui/js/echarts.js" charset="UTF-8"></script>
</head>
<body>
<div id="main"  style="width: 90%;height:600px;"></div>
<script type="text/javascript">
    // 基于准备好的dom，初始化echarts实例
    var myChart = echarts.init(document.getElementById('main'));


    var option = {
        title: {
            text: '每天销售价格最高',
            target: 'self',
            textStyle: {
                color: 'red'
            }
        },
        tooltip: {
            trigger: 'axis',
        },
        legend: {
            top: "0%",
            textStyle: {
                color: "rgba(255,255,255,.5)",
                fontSize: "12"
            }
        },
        grid: {
            top: '30',
            left: '10',
            right: '30',
            bottom: '10',
            containLabel: true
        },
        xAxis: [{
            type: 'category',
            boundaryGap: false,
            // 文本颜色为rgba(255,255,255,.6)  文字大小为 12
            axisLabel: {
                textStyle: {
                    color: "#000",
                    fontSize: 12
                }
            },
            // x轴线的颜色为   rgba(255,255,255,.2)
            axisLine: {
                lineStyle: {
                    color: "#33ccff"
                }
            },
            data: data.names
        }],
        yAxis: [{
            type: 'value',
            axisTick: {
                // 不显示刻度线
                show: false
            },
            axisLine: {
                lineStyle: {
                    color: "#33ccff"
                }
            },
            axisLabel: {
                textStyle: {
                    color: "#000",
                    fontSize: 12
                }
            },
            // 修改分割线的颜色
            splitLine: {
                lineStyle: {
                    color: "#33ffff"
                }
            }
        }],
        series: [{
            name: '20220520',
            textStyle: {
                color: 'red'
            },
            type: 'line',
            smooth: true, // 圆滑的线
            // 单独修改当前线条的样式
            lineStyle: {
                color: "#0184d5",
                width: 2
            },
            // 填充区域渐变透明颜色
            areaStyle: {
                color: new echarts.graphic.LinearGradient(
                    0,
                    0,
                    0,
                    1,
                    [{
                        offset: 0,
                        color: "rgba(1, 132, 213, 0.4)" // 渐变色的起始颜色
                    },
                        {
                            offset: 0.8,
                            color: "rgba(1, 132, 213, 0.1)" // 渐变线的结束颜色
                        }
                    ],
                    false
                ),
                shadowColor: "rgba(0, 0, 0, 0.1)"
            },
            // 拐点设置为小圆点
            symbol: 'circle',
            // 设置拐点大小
            symbolSize: 5,
            // 开始不显示拐点， 鼠标经过显示
            showSymbol: false,
            // 设置拐点颜色以及边框
            itemStyle: {
                color: "#0184d5",
                borderColor: "rgba(221, 220, 107, .1)",
                borderWidth: 12
            },
            data: [4089, 4088, 2999,,,,,,,]
        },
            {
                name: "20220521",
                type: "line",
                smooth: true,
                lineStyle: {
                    normal: {
                        color: "#00d887",
                        width: 2
                    }
                },
                areaStyle: {
                    normal: {
                        color: new echarts.graphic.LinearGradient(
                            0,
                            0,
                            0,
                            1,
                            [{
                                offset: 0,
                                color: "rgba(0, 216, 135, 0.4)"
                            },
                                {
                                    offset: 0.8,
                                    color: "rgba(0, 216, 135, 0.1)"
                                }
                            ],
                            false
                        ),
                        shadowColor: "rgba(0, 0, 0, 0.1)"
                    }
                },
                // 设置拐点 小圆点
                symbol: "circle",
                // 拐点大小
                symbolSize: 5,
                // 设置拐点颜色以及边框
                itemStyle: {
                    color: "#00d887",
                    borderColor: "rgba(221, 220, 107, .1)",
                    borderWidth: 12
                },
                // 开始不显示拐点， 鼠标经过显示
                showSymbol: false,
                data: [,, ,4089, 4088, 2999,,,,]
            },
            {
                name: "20220522",
                type: "line",
                smooth: true,
                lineStyle: {
                    normal: {
                        color: "#ffff00",
                        width: 2
                    }
                },
                areaStyle: {
                    normal: {
                        color: new echarts.graphic.LinearGradient(
                            0,
                            0,
                            0,
                            1,
                            [{
                                offset: 0,
                                color: "#ffff66"
                            },
                                {
                                    offset: 0.8,
                                    color: "#ffffff"
                                }
                            ],
                            false
                        ),
                        shadowColor: "rgba(0, 0, 0, 0.1)"
                    }
                },
                // 设置拐点 小圆点
                symbol: "circle",
                // 拐点大小
                symbolSize: 5,
                // 设置拐点颜色以及边框
                itemStyle: {
                    color: "#ffff00",
                    borderColor: "rgba(221, 220, 107, .1)",
                    borderWidth: 12
                },
                // 开始不显示拐点， 鼠标经过显示
                showSymbol: false,
                data: [,, ,,,,1190, 990, 790]
            }
        ]
    };

    // 使用刚指定的配置项和数据显示图表。
    myChart.setOption(option);
</script>
</body>
</html>