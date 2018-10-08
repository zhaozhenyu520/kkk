<template>
	<div>

		<Myheader>
		</Myheader>
		<ul id="ul1">
			<li><router-link to="/audio/dy">电影</router-link></li>
			<li><router-link to="/audio/ds">电视</router-link></li>
			<li><router-link to="/audio/zy">综艺</router-link></li>
			<li><router-link to="/audio/dshu">读书</router-link></li>
			<li><router-link to="/audio/yy">音乐</router-link></li>
			<li><router-link to="/audio/tc">同城</router-link></li><br>
		</ul>

		<div id="ccc">
		<router-view></router-view>
		</div>
	</div>
</template>
<script>
	import Myheader from '@/components/header.vue'
	export default {
		components:{
			Myheader
		}
	};
</script>
<style>
	
	li{
		list-style: none;
		float: left;
		margin-right: 25px;
	}
	#ul1{
		float: left;
		 margin-left: 560px
	}
	#ccc{
		float: left;
		padding-left: 600px
	}
</style>