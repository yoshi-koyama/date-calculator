#!/bin/sh

./gradlew clean build

docker compose up -d
