import 'package:flutter/material.dart';
import 'package:flutter/rendering.dart';
import 'package:flutter/widgets.dart';

class HomePage extends StatefulWidget {
  @override
  _HomePageState createState() => _HomePageState();
}

class _HomePageState extends State<HomePage> {
  void _incrementCounter() {}

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      body: Stack(
        children: [
          Padding(
            padding: const EdgeInsets.all(20.0),
            child: FloatingActionButton(
              backgroundColor: Theme.of(context).primaryColor,
              splashColor: Theme.of(context).focusColor,
              foregroundColor: Theme.of(context).backgroundColor,
              onPressed: _incrementCounter,
              child: Icon(Icons.close),
            ),
          ),
          Align(
            heightFactor: 11,
            child: FloatingActionButton(
              backgroundColor: Theme.of(context).primaryColor,
              splashColor: Theme.of(context).focusColor,
              foregroundColor: Theme.of(context).backgroundColor,
              onPressed: _incrementCounter,
              child: Icon(Icons.keyboard_arrow_down),
            ),
          ),
          Align(
            heightFactor: 5,
            child: FloatingActionButton(
              backgroundColor: Theme.of(context).primaryColor,
              splashColor: Theme.of(context).focusColor,
              foregroundColor: Theme.of(context).backgroundColor,
              onPressed: _incrementCounter,
              child: Icon(Icons.keyboard_arrow_up),
            ),
          ),
          Align(
            heightFactor: 8,
            widthFactor: 6,
            alignment: Alignment.centerRight,
            child: FloatingActionButton(
              backgroundColor: Theme.of(context).primaryColor,
              splashColor: Theme.of(context).focusColor,
              foregroundColor: Theme.of(context).backgroundColor,
              onPressed: _incrementCounter,
              child: Icon(Icons.keyboard_arrow_right),
            ),
          ),
          Align(
            heightFactor: 8,
            widthFactor: 2,
            alignment: Alignment.centerRight,
            child: FloatingActionButton(
              backgroundColor: Theme.of(context).primaryColor,
              splashColor: Theme.of(context).focusColor,
              foregroundColor: Theme.of(context).backgroundColor,
              onPressed: _incrementCounter,
              child: Icon(Icons.keyboard_arrow_left),
            ),
          ),
          Align(
            heightFactor: 8,
            alignment: Alignment.center,
            child: GestureDetector(
              onTap: _onOKClick(),
              child: Container(
                height: 56,
                width: 56,
                child: Icon(
                  Icons.workspaces,
                  size: 35,
                ),
              ),
            ),
          ),
          Padding(
            padding: const EdgeInsets.all(20.0),
            child: Align(
              alignment: Alignment.bottomCenter,
              heightFactor: 7.5,
              child: FloatingActionButton(
                backgroundColor: Theme.of(context).primaryColor,
                splashColor: Theme.of(context).focusColor,
                foregroundColor: Theme.of(context).backgroundColor,
                onPressed: _incrementCounter,
                child: Icon(Icons.keyboard_return),
              ),
            ),
          ),
          Padding(
            padding: const EdgeInsets.all(20.0),
            child: Align(
              heightFactor: 7.5,
              alignment: Alignment.bottomLeft,
              child: FloatingActionButton(
                backgroundColor: Theme.of(context).primaryColor,
                splashColor: Theme.of(context).focusColor,
                foregroundColor: Theme.of(context).backgroundColor,
                onPressed: _incrementCounter,
                child: Icon(Icons.cottage),
              ),
            ),
          ),
          Padding(
            padding: const EdgeInsets.all(20.0),
            child: Align(
              heightFactor: 7.5,
              alignment: Alignment.bottomRight,
              child: FloatingActionButton(
                backgroundColor: Theme.of(context).primaryColor,
                splashColor: Theme.of(context).focusColor,
                foregroundColor: Theme.of(context).backgroundColor,
                onPressed: _incrementCounter,
                child: Icon(Icons.menu),
              ),
            ),
          ),
          Align(
            heightFactor: 4.4,
            alignment: Alignment.bottomCenter,
            child: Container(
              padding: EdgeInsets.only(top: 10, bottom: 10, left: 5, right: 5),
              decoration: BoxDecoration(
                  borderRadius: BorderRadius.circular(100),
                  color: Colors.black26),
              child: Column(
                mainAxisSize: MainAxisSize.min,
                children: [
                  FloatingActionButton(
                    backgroundColor: Theme.of(context).primaryColor,
                    splashColor: Theme.of(context).focusColor,
                    foregroundColor: Theme.of(context).backgroundColor,
                    onPressed: _incrementCounter,
                    child: Icon(Icons.add),
                  ),
                  Container(
                    height: 10,
                    width: 0,
                  ),
                  FloatingActionButton(
                    backgroundColor: Theme.of(context).primaryColor,
                    splashColor: Theme.of(context).focusColor,
                    foregroundColor: Theme.of(context).backgroundColor,
                    onPressed: _incrementCounter,
                    child: Icon(Icons.remove),
                  )
                ],
              ),
            ),
          ),
          Padding(
            padding: const EdgeInsets.all(20.0),
            child: Align(
              alignment: Alignment.topRight,
              child: FloatingActionButton(
                backgroundColor: Theme.of(context).primaryColor,
                splashColor: Theme.of(context).focusColor,
                foregroundColor: Theme.of(context).backgroundColor,
                onPressed: _incrementCounter,
                child: Icon(Icons.settings),
              ),
            ),
          )
        ],
      ), // This trailing comma makes auto-formatting nicer for build methods.
    );
  }

  ///点击ok
  _onOKClick() {}
}
