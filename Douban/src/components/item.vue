<template >
	<div class="flaot" @click="fn">
		<span v-show="bol">  <slot  name="slot1"></slot></span>
		<span v-show="!bol"> <slot  name="slot2"></slot></span>
		<p></p>
		<span v-bind:class="{test:!bol}">{{text}}</span>
	</div>
</template>

<script>
	export default{
		props:['text',"mark","sel"],
		data:function(){
			return {
				arr:['/home','/audio','/broadcast','/group','/mine']
			}
		},
		computed:{
			bol:function () {
				if (this.mark==this.sel) {		
					this.$router.push(this.arr[this.mark-1])	
					return false
				}else{
					return true
				}
			}
		},methods:{
			fn:function(){
				this.$emit("change",this.mark)
			}
		}
	};

</script>

<style type="text/css">
	.flaot{
		float:left;
		
	}

	.test{
		color: red;
	}
</style>