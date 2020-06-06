-module(openapi_order_statistic).

-include("openapi.hrl").

-export([openapi_order_statistic/0]).

-export_type([openapi_order_statistic/0]).

-type openapi_order_statistic() ::
  binary().

openapi_order_statistic() ->
  elements([<<"item_sold_minecraft">>, <<"prepaid_card_redeemed_minecraft">>, <<"item_sold_cobalt">>, <<"item_sold_scrolls">>, <<"prepaid_card_redeemed_cobalt">>, <<"item_sold_dungeons">>]).
  
