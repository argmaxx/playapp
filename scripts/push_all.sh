#!/bin/bash

if [ ! -n "$1" ]
then
echo "Usage: `basename $0` <message>"
exit $E_BADARGS
fi
export cmd="git add ."
echo $cmd
$cmd
echo ""
export cmd="git commit -a -m "
echo $cmd "\"$1\""
$cmd "$1"
echo ""
export cmd="git push origin master"
echo $cmd
$cmd
echo ""
export cmd="git push heroku master"
echo $cmd
$cmd
echo ""



