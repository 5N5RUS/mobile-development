import 'package:flutter/material.dart';

class AppTabBarWidgets extends StatefulWidget {
  const AppTabBarWidgets({super.key});

  @override
  _AppTabBarWidgetsState createState() => _AppTabBarWidgetsState();
}

class _AppTabBarWidgetsState extends State<AppTabBarWidgets> {
  @override
  Widget build(BuildContext context) {
    return Stack(
            alignment: Alignment.topCenter,
            children: [
              Row(
                mainAxisAlignment: MainAxisAlignment.spaceBetween,
                children: [
                  IconButton(
                    onPressed: (){}, 
                    icon: const Image(image: AssetImage('assets/svg/clean.png'),
                      width: 24,
                      height: 24, 
                    )
                  ),
                  IconButton(
                    onPressed: (){}, 
                    icon: const Image(image: AssetImage('assets/svg/exit.png'),
                      width: 24,
                      height: 24, 
                    )
                  ),
                ],
              ),
              Container(
                margin: const EdgeInsets.only(top: 14),
                child:
              const Column(
                children: [
                  Image(
                    image: AssetImage('assets/images/profile_avatar.png'),
                    width: 110,
                    height: 110,
                  ),
                  SizedBox(height: 36),
                  Text(
                    'Екатерина',
                    style: TextStyle(
                      color: Colors.black,
                      fontSize: 24,
                      fontFamily: 'SF Pro Display',
                      fontWeight: FontWeight.w700,
                    ),
                  ),
                ],
              )
              )
            ],
          );
  }
}        