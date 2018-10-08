<template>
	<div>
		<ul id="ul2">
			<li id="li2"><router-link to="/group/dbdp">豆瓣豆拼</router-link></li>
			<li><router-link to="/group/dbsj">豆瓣时间</router-link></li><br>
		</ul>
		<router-view></router-view>
	</div>
</template>

<style>
	#ul2{
		margin-left: 620px
	}
	#li2{
		margin-right: 50px;
	}
</style>
