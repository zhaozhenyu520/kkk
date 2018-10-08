
<template>
	<div>
		 <shuju :arr="arr">s</shuju>
	</div>
</template>


<script>
import axios from 'axios'
import shuju from './dongtai'
	export default{
		components:{
			shuju
		},

		data:function(){
		return{	
			arr:[]
		}
		},
		mounted(){			
			this.fn();	 
		},
		methods:{
			fn(){
				axios.get("http://localhost:8088/Douban/myController/ShiJiSelect.html").then(
					value=>{
						this.arr=value.data
		 			})

			}
		}
	};
</script>