-module(openapi_game_profile).

-export([encode/1]).

-export_type([openapi_game_profile/0]).

-type openapi_game_profile() ::
    #{ 'agent' => binary(),
       'id' => binary(),
       'name' => binary(),
       'userId' => binary(),
       'createdAt' => integer(),
       'legacyProfile' => boolean(),
       'suspended' => boolean(),
       'paid' => boolean(),
       'migrated' => boolean(),
       'legacy' => boolean()
     }.

encode(#{ 'agent' := Agent,
          'id' := Id,
          'name' := Name,
          'userId' := UserId,
          'createdAt' := CreatedAt,
          'legacyProfile' := LegacyProfile,
          'suspended' := Suspended,
          'paid' := Paid,
          'migrated' := Migrated,
          'legacy' := Legacy
        }) ->
    #{ 'agent' => Agent,
       'id' => Id,
       'name' => Name,
       'userId' => UserId,
       'createdAt' => CreatedAt,
       'legacyProfile' => LegacyProfile,
       'suspended' => Suspended,
       'paid' => Paid,
       'migrated' => Migrated,
       'legacy' => Legacy
     }.
