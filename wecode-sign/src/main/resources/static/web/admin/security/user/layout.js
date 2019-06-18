// TODO: 1.pageContext 需要预加载 ，2.widget/data/datable 需要在使用时加载
pageContext.controller("admin.sitemap.layout",["widget/tab"],function(page){
	
	page.ready = function(){
		$("#demoTab").xWidget("tab",{
			pages:[{
				title:"用户列表",
				url:"/web/admin/security/user/list.html", 
				allowClose:true
			}]
		}); 
	}
	
});
