//var http = require("http");
//	http.createServer(function (request, response) {
//
//		// 发送 HTTP 头部 
//		// HTTP 状态值: 200 : OK
//		// 内容类型: text/plain
//		response.writeHead(200, {'Content-Type': 'text/plain'});
//
//		// 发送响应数据 "Hello World"
//		response.end('Hello World\n');
//	}).listen(8888);
//	console.log('Server running at http://127.0.0.1:8888/');

var elasticsearch = require('elasticsearch');

// 使用默认配置连接到 localhost:9200
//var client = new elasticsearch.Client();

// 连接两个节点，负载均衡使用round-robin算法
var client = elasticsearch.Client({
  hosts: [
    '192.168.93.128:9201',
    '192.168.93.129:9200'
  ]
});

//获取状态，参数可选，可以只传递一个回调
client.cluster.health(function (err, resp) {
  if (err) {
    console.error(err.message);
  } else {
    console.dir(resp);
  }
});

 //建立索引
client.index({
  index: 'blog',
  type: 'post',
  id: 1,
  body: {
    title: 'JavaScript Everywhere!',
    content: 'It all started when...',
    date: '2013-12-17'
  }
}, function (err, resp) {
//  console.log(resp);
});


//搜索文档 
client.search({
  index: 'dept',
  type: "employee",
  size: 50,
  body: {
    query: {
      match_all: {
      }
    }
  }
}).then(function (resp) {
	console.log(resp.hits.hits);
});

// 搜索文档 
//client.search({
//  index: 'dept',
//  size: 50,
//  body: {
//    query: {
//      match: {
//    	 "age": 19
//      }
//    }
//  }
//}).then(function (resp) {
//  var hits = resp.body.hits;
//  console.log(hits);
//});
