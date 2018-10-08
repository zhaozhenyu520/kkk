<template>
		<div class="imgdax">
		<div class="swiper-container">
  			<div class="swiper-wrapper">
				
   				<img class="swiper-slide " src="@/assets/img/1.jpg" />
				<img class="swiper-slide " src="@/assets/img/2.jpg" />
				<img class="swiper-slide " src="@/assets/img/3.jpg" />
				
 			 </div> 
 				<div class="swiper-pagination"></div>
  				<div class="swiper-button-prev"></div>
  				<div class="swiper-button-next"></div>

</div>
			<ul  v-for="item in arr">
				<li>{{item.name}}{{item.jiage}}{{item.jieshao}}</li>
			</ul>
</div>
</template>

<script>

import Swiper from 'swiper'	
import 'vue/dist/vue.js'
import 'swiper/dist/css/swiper.min.css'
import 'swiper/dist/js/swiper.min.js'
import axios from 'axios'
 export default{
 		data:function(){
 			return {
 				arr:[]
 			}
 		},
  		mounted(){
			 var swiper = new Swiper('.swiper-container',{
				autoplay: true,
				loop:true,
				pagination:{
					el:".swiper-pagination",
					clickable:true,
				},
				  navigation: {
      				  nextEl: '.swiper-button-next',
        			  prevEl: '.swiper-button-prev',
    			  },
			});		
			this.fn();	 	
		},
		methods:{
			fn(){
				axios.get("http://localhost:8088/Douban/myController/ShiJiSelect.html").then(
					value=>{
						this.arr=value.data
		 			})

			}
		},
 };


</script>

<style>
	.imgdax{
		width: 300px;
		height: 0px;
		margin-left: 600px
	}
</style>