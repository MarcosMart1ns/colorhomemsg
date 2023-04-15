# Customize if the directory is not relative
# Template:
# helm upgrade --install <nameToIdentifyChartImplementation> <chartLocation> --values <values.yaml location> --namespace <kubernetesNamespace>

helm upgrade --install color-home-msg-from-helm-chart ../helm --values ../helm/values.yaml --namespace colorhomehelm --dry-run