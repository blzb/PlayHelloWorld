[ -f target/universal/stage/RUNNING_PID ] && kill -TERM $(cat target/universal/stage/RUNNING_PID) || echo "File does not exists"
nohup ./target/universal/stage/bin/hello_world &