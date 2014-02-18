kill -TERM $(cat target/universal/stage/RUNNING_PID)
nohup ./target/universal/stage/bin/hello_world &