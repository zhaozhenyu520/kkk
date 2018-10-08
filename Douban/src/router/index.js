import Vue from 'vue'
import Router from 'vue-router'
import HelloWorld from '@/components/HelloWorld'
import Audio from '../pages/Audio/audio'
import Broadcast from '../pages/Broadcast/broadcast'
import Group from '../pages/Group/group'
import Home from '../pages/Home/home'
import Mine from '../pages/Mine/mine'
//书阴影
import Ds from '@/pages/Audio/Audios/ds.vue'
import Dshu from '@/pages/Audio/Audios/dshu.vue'
import Dy from '@/pages/Audio/Audios/dy.vue'
import Tc from '@/pages/Audio/Audios/tc.vue'
import Yy from '@/pages/Audio/Audios/yy.vue'
import Zy from '@/pages/Audio/Audios/zy.vue'


//首页
import Dt from '@/pages/Home/Homes/dt.vue'
import Dongtai from '@/pages/Home/Homes/dongtai.vue'
import Tj from '@/pages/Home/Homes/tj.vue'

//市集
import Dbdp from '@/pages/Group/Groups/dbdp.vue'
import Dbsj from '@/pages/Group/Groups/dbsj.vue'

Vue.use(Router)

export default new Router({
  routes: [
    { path: '/',name: '/Home',component: Home},
    { path: '/home',name: 'Home',component: Home,
        children:[
        {path:'',component:Dt},
        {path:'dt',component:Dt},
        {path:'tj',component:Tj},
        {path:'dongtai',component:Dongtai}
        ]
        },

    { path: '/mine',name: 'Mine',component: Mine},

    { path: '/audio',name: 'Audio',component: Audio,
    children:[
    {path:"",component:Dy},
    {path:"ds",component:Ds},
    {path:"dshu",component:Dshu},
    {path:"dy",component:Dy},
    {path:"tc",component:Tc},
    {path:"yy",component:Yy},
    {path:"zy",component:Zy},
    ]
	},

    { path: '/broadcast',name: 'Broadcast',component: Broadcast},
    { path: '/group',name: 'Group',component: Group,
    children:[
    {path:"",component:Dbdp},
    {path:"dbdp",component:Dbdp},
    {path:"dbsj",component:Dbsj}
    ]
    }
  ]
})
