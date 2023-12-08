import 'package:flutter/material.dart';

class SettingsMessage extends StatefulWidget {
  const SettingsMessage({super.key});

  @override
  _SettingsMessageState createState() => _SettingsMessageState();
}

class _SettingsMessageState extends State<SettingsMessage> {
  @override
  Widget build(BuildContext context) {
    return const Center(
      child:
      Tab(text: 'To be continued..'),
    );
  }  
}