#!/bin/bash

### PRODUCTION MODE

#export cmd='play -Dconfig.file=conf/development.conf -DapplyEvolutions.default=false -Dhttp.port=8080 start'
export cmd='play -Dconfig.file=conf/application.conf -DapplyEvolutions.default=false -Dhttp.port=8080 start'
echo $cmd
exec $cmd

