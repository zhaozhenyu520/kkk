<template>
	<div>
		<Myheader>
		</Myheader>

		<ul id="ul">
			<li id="li"> 
				<router-link to="/home/dt">动态</router-link></li>
			<li><router-link to="/home/tj">推荐</router-link></li><br>
		</ul>
			<div id="cc1">
				<router-view></router-view>
			</div>

	</div>
</template>
 <script src="https://unpkg.com/axios/dist/axios.min.js"></script>
<script>
	import Myheader from '@/components/header.vue'
	export default {
		components:{
			Myheader
		 },data:function(){
		 		return {
		 			arr:[]
		 		}
		 },
		 	methods:{
			fn(){
				axios.get("http://localhost:8088/Douban/myController/ShiJiSelect.html").then(
					value=>{
						this.arr=value.data
						alert(value.data);
		 			})

			}
		},
	};
</script>

<style>
	#li{
		 margin-right: 50px;
	}

	li{
		 list-style: none;
		 float: left;
	}
	#ul{
	
		
		 margin-left: 650px
	}
	#cc1{
		float: left;
		padding-left: 600px
	}
</style>