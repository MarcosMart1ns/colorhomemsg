cd ../

## build image
echo "Building Image"
docker build -t xmartinezzz/colorhomemsg:latest ../

## pull image to repo
echo "Pulling image to image repo"
docker push xmartinezzz/colorhomemsg:latest