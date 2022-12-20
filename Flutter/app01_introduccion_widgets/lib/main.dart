import 'package:flutter/material.dart';

void main() {
  runApp(
      const MaterialApp(
        title: 'Hola mundo App',
        home: SafeArea(
            child: MyHelloWorldApp()
        )
      )
  );
}

class MyHelloWorldApp extends StatelessWidget {
  const MyHelloWorldApp({super.key});

  @override
  Widget build(BuildContext context) {
    return Material(
      child: Column(
        children: [
          Container(
            height: 50,
            padding: const EdgeInsets.all(8),
            decoration: const BoxDecoration(color: Colors.red),
            child: Row(
              children: const [
                IconButton(
                  onPressed: null,
                  icon: Icon(Icons.menu),
                  tooltip: 'Navegacion'),
                Expanded(
                    child: Text('App Hola Mundo')
                ),
                IconButton(
                    onPressed: null,
                    icon: Icon(Icons.search)
                )
              ],
            ),
          ),
          const Expanded(
            child: Center(
              child: Text('Hola mundo cruel',)
            ),
          ),
        ],
      ),
    );
  }
}
