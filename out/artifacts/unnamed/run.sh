#!/bin/sh
java -Xms30m -Xmx512m -XX:MinHeapFreeRatio=5 -XX:MaxHeapFreeRatio=25 -XX:+UseParNewGC -XX:+UseTLAB -XX:GCTimeRatio=32 -jar  unnamed.jar