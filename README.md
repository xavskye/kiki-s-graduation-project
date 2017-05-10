# Chart-Server
## 技术架构
    - Spring+SpringMVC+Mybatis+jetty
    - 数据库使用mysql
    - 使用标准MVC模式
    - 使用resetful风格定义对外接口
    
## 数据库表定义
    - table:    charts
    | id     | title | background_color | scale_text_color | value_text_color | chart_data | type |
    | -----: | -----:| ----------------:| ----------------:| ----------------:| ----------:| ----:|

## 数据结构定义
    - chart_data(JSON)
    - data-struct-example:
    {
        "nameList": [
            {
                "name": "colA",
                "color": "bule"
            },
            {
                "name": "colA",
                "color": "bule"
            },
            {
                "name": "colA",
                "color": "bule"
            }
        ],
        "valueList": [
            {
                "row_name":"rowA",
                "values": [
                    "value_A1",
                    "value_A2",
                    "value_A3"
                ]
            },
            {
                "row_name":"rowB",
                "values": [
                    "value_B1",
                    "value_B2",
                    "value_B3"
                ]
            }
        ]
    }
    
## reset api定义
    - 获取图表
      GET $REST_URL/kiki/{type}/chart?title=xxx
    
    - 新建图表
      POST $REST_URL/kiki/{type}/chart
        requestBody: 
        {
            "title":"",
            "background_color":"",
            "scale_text_color":"",
            "value_text_color":"",
            "chart_data":$CHART_DATA
        }
       
    - 修改图表    
      PUT $REST_URL/kiki/{type}/chart
        requestBody: 
        {
            "title":"",
            "background_color":"",
            "scale_text_color":"",
            "value_text_color":"",
            "chart_data":$CHART_DATA
        } 
    
    - 删除图表
      DELETE $REST_URL/kiki/{type}/chart?title=xxx