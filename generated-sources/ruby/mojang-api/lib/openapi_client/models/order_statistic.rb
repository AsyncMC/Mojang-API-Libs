=begin
#Mojang API

#No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)

OpenAPI spec version: 2020-06-05

Generated by: https://openapi-generator.tech
OpenAPI Generator version: 3.3.4

=end

require 'date'

module OpenapiClient
  class OrderStatistic
    
    ITEM_SOLD_MINECRAFT = 'item_sold_minecraft'.freeze
    PREPAID_CARD_REDEEMED_MINECRAFT = 'prepaid_card_redeemed_minecraft'.freeze
    ITEM_SOLD_COBALT = 'item_sold_cobalt'.freeze
    ITEM_SOLD_SCROLLS = 'item_sold_scrolls'.freeze
    PREPAID_CARD_REDEEMED_COBALT = 'prepaid_card_redeemed_cobalt'.freeze
    ITEM_SOLD_DUNGEONS = 'item_sold_dungeons'.freeze

    # Builds the enum from string
    # @param [String] The enum value in the form of the string
    # @return [String] The enum value
    def build_from_hash(value)
      constantValues = OrderStatistic.constants.select { |c| OrderStatistic::const_get(c) == value }
      raise "Invalid ENUM value #{value} for class #OrderStatistic" if constantValues.empty?
      value
    end
  end
end