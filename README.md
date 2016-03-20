#主题切换
##实现方法
1.使用AppCompat DayNight theme</br>
2.AppCompatDelegate.setDefaultNightMode()实现全局的主题切换</br>
##注意事项：
1.ActionBar是不随者主题切换该表外观的，需要自己重新设定</br>
2.Context.getDelegate().setLocalNightMode()改变主题模式后，在UiModeManager.getNightMode()中体现不出来更换的模式。建议设置一个全局变量来存储模式的值，然后在onSaveInstanceState()中保存该值。</br>
##Guide
<a href="http://android-developers.blogspot.hk/2016/02/android-support-library-232.html">Android Support Library 23.2</a>
