import 'dart:io';

import 'package:flutter/material.dart';
import 'package:flutter/services.dart';
import 'package:flutter_net/net/base/dio_manager.dart';

import 'screen/home.dart';

void main() {
  //透明状态栏
  runApp(Launcher());
  _transStatusBar();
}

_transStatusBar() {
  if (Platform.isAndroid) {
    SystemChrome.setEnabledSystemUIMode(SystemUiMode.manual,overlays: []);
  }
}
class Launcher extends StatelessWidget {
  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      theme: ThemeData(
        primaryColor: Colors.grey[100],
        backgroundColor: Colors.black87,
        focusColor: Colors.black26,
      ),
      home: HomePage(),
    );
  }
}
