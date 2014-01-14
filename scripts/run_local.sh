#!/bin/bash

#export cmd='play -Dconfig.file=conf/development.conf -DapplyEvolutions.default=false -Dhttp.port=8080 run'
export cmd='play -Dconfig.file=conf/application.conf -DapplyEvolutions.default=false -Dhttp.port=8080 run'
echo $cmd
exec $cmd

