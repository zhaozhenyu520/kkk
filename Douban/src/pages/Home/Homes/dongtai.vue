<template>
	<div>
		<ul  v-for="item in arr">
            <li>
                {{item.name}}{{item.jieshao}}{{item.jiage}}      	
            </li>
	 	 </ul>
		
	</div>
</template>
<script>

import axios from 'axios'
 export default{
 			 props:['arr'],			
 };

</script>






