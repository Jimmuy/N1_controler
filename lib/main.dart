import 'dart:io';

import 'package:flutter/material.dart';
import 'package:flutter/services.dart';

import 'screen/home.dart';

void main() {
  //透明状态栏
  _transStatusBar();
  runApp(Launcher());
}

_transStatusBar() {
  if (Platform.isAndroid) {
    SystemChrome.setSystemUIOverlayStyle(
        SystemUiOverlayStyle(statusBarColor: Colors.transparent));
  }
}
class Launcher extends StatelessWidget {
  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      theme: ThemeData(
        primarySwatch: Colors.blue,
      ),
      home: HomePage(),
    );
  }
}
