import 'package:flutter/material.dart';
import 'package:mobius2020/contents/apptabbar/widgets/app_tabbar_widgets.dart';
import 'package:mobius2020/contents/tabs/tab_profile.dart';
import 'package:mobius2020/contents/tabs/tab_settings.dart';

class AppTabBar extends StatefulWidget {
  const AppTabBar({super.key});

  @override
  _AppTabBarState createState() => _AppTabBarState();
}

class _AppTabBarState extends State<AppTabBar> {
  @override
  Widget build(BuildContext context) {
    return DefaultTabController(
      length: 2, 
      child: 
        Scaffold(
          appBar: AppBar(
            toolbarHeight: 226,
            title: const AppTabBarWidgets(),
            bottom: const TabBar(
                      indicatorSize: TabBarIndicatorSize.tab,
                      labelColor: Colors.black,
                      unselectedLabelColor: Colors.grey,
                      indicatorColor: Colors.green,
                      tabs: [
                        Tab(text: 'Профиль'),
                        Tab(text: 'Настройки')
                      ],
                    )
          ),
          body: const TabBarView(
            children: [
              TabProfile(),
              TabSettings(),
            ],
          ),  
        ),
    ); 
  }  
}