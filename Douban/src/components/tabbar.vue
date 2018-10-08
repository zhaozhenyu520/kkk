 <template>
 	<div id="bianju">
	<Item class="flaot" text="首页" mark=1 @change="getval" :sel="selected">
		<img  slot="slot1" src="../assets/1.png">
		<img  slot="slot2" src="../assets/6.png">
  	</Item>
	
	<Item text="书影音" mark=2 @change="getval" :sel="selected">
	<img  slot="slot1" src="../assets/2.png">
	<img  slot="slot2" src="../assets/7.png">
  	</Item>

  	<Item text="小组" mark=3 @change="getval" :sel="selected">
	<img  slot="slot1" src="../assets/3.png">
	<img  slot="slot2" src="../assets/8.png">
  	</Item>

  	<Item text="市集" mark=4 @change="getval" :sel="selected">
	<img  slot="slot1" src="../assets/4.png">
	<img  slot="slot2" src="../assets/9.png">
  	</Item>


  	<Item text="我的" mark=5 @change="getval" :sel="selected">
	<img  slot="slot1" src="../assets/5.png">
	<img  slot="slot2" src="../assets/10.png">
  	</Item>
	</div>
</template>

<script>
	import Item from '../components/item.vue'
	  export default{
		components:{
			Item
		},
		data(){
			return{
				selected:1
			}
		},		
		methods:{
			getval:function (val) {
			    this.selected=val
			}
		}	
	};
</script> 

<style>
	#bianju{
		margin-top: 490px;
		margin-left: 600px
	}
</style>