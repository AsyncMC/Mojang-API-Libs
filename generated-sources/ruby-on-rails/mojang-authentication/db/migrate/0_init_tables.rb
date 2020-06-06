=begin
Mojang Authentication API

No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)

OpenAPI spec version: 2020-06-05
Generated by: https://github.com/openapitools/openapi-generator.git

=end

class InitTables < ActiveRecord::Migration
  def change
    create_table "access_keys".pluralize.to_sym, id: false do |t|
      t.string :access_token
      t.string :client_token

      t.timestamps
    end

    create_table "agent".pluralize.to_sym, id: false do |t|
      t.string :name
      t.integer :version

      t.timestamps
    end

    create_table "authentication".pluralize.to_sym, id: false do |t|
      t.string :access_token
      t.string :client_token

      t.timestamps
    end

    create_table "authentication_request".pluralize.to_sym, id: false do |t|
      t.string :username
      t.string :password

      t.timestamps
    end

    create_table "error".pluralize.to_sym, id: false do |t|
      t.string :error
      t.string :error_message

      t.timestamps
    end

    create_table "game_profile".pluralize.to_sym, id: false do |t|
      t.string :agent
      t.string :id
      t.string :name
      t.string :user_id
      t.integer :created_at
      t.boolean :legacy_profile
      t.boolean :suspended
      t.boolean :paid
      t.boolean :migrated
      t.boolean :legacy

      t.timestamps
    end

    create_table "game_profile_property".pluralize.to_sym, id: false do |t|
      t.string :name
      t.string :value

      t.timestamps
    end

    create_table "private_user_data".pluralize.to_sym, id: false do |t|
      t.string :id
      t.string :properties

      t.timestamps
    end

    create_table "profile_id".pluralize.to_sym, id: false do |t|
      t.string :id
      t.string :name

      t.timestamps
    end

    create_table "reduced_user_data".pluralize.to_sym, id: false do |t|
      t.string :id
      t.string :properties

      t.timestamps
    end

    create_table "refresh_request".pluralize.to_sym, id: false do |t|
      t.string :access_token
      t.string :client_token

      t.timestamps
    end

    create_table "refresh_response".pluralize.to_sym, id: false do |t|
      t.string :access_token
      t.string :client_token

      t.timestamps
    end

    create_table "username_password".pluralize.to_sym, id: false do |t|
      t.string :username
      t.string :password

      t.timestamps
    end

  end
end
