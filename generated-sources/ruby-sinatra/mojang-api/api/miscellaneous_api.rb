require 'json'


MyApp.add_route('POST', '/orders/statistics', {
  "resourcePath" => "/Miscellaneous",
  "summary" => "Get statistics on the sales of Minecraft.",
  "nickname" => "get_orders_statistics", 
  "responseClass" => "OrderStatisticsResponse",
  "endpoint" => "/orders/statistics", 
  "notes" => "",
  "parameters" => [
    {
      "name" => "body",
      "description" => "The payload is a json list of options under the metricKeys key. You will receive a single object corresponding to the sum of sales of the requested type(s). You must request at least one type of sale. Below is the default list used by https://minecraft.net/en/stats/",
      "dataType" => "OrderStatisticsRequest",
      "paramType" => "body",
    }
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end

