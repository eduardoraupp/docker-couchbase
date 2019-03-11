FROM couchbase:latest

RUN apt-get update && \
	apt-get install -y curl

RUN chmod -R 777 /opt/couchbase/var/ && \
	chmod -R 777 /opt/couchbase/etc/ && \
	chmod -R 777 /opt/couchbase/share/ && \
	chmod -R 777 /opt/couchbase/bin/ && \
	chmod -R 777 /opt/couchbase/var/ && \
	chmod -R 777 /mnt/

