/**
 * Mojang API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * OpenAPI spec version: 2020-06-05
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

/**
 * Request Mojang to download a skin from an URL and apply to the player
 */
export interface ChangeSkinRequest {
  model?: SkinModel;
  /**
   * The URL which Mojang servers will download and apply the skin
   */
  url: string;
}

/**
 * The current player, demo and legacy status of a player identified by the id
 */
export interface CurrentPlayerIDs {
  /**
   * The player UUID without hyphens
   */
  id: string;
  /**
   * The current name being used by this player
   */
  name: string;
  /**
   * If account has not been converted
   */
  legacy?: boolean;
  /**
   * If the player has not puchased the game
   */
  demo?: boolean;
}

/**
 * This is returned when the request fails
 */
export interface ModelError {
  error?: string;
  errorMessage?: string;
}

/**
 * A registered name change.
 */
export interface NameChange {
  /**
   * The new player name
   */
  name: string;
  /**
   * Time which the name was changed in UNIX Timestamp without milliseconds. Usually absent for the first entry.
   */
  changedToAt?: number;
}

/**
 * Valid options to query the order statistics
 */
export type OrderStatistic = 'item_sold_minecraft' | 'prepaid_card_redeemed_minecraft' | 'item_sold_cobalt' | 'item_sold_scrolls' | 'prepaid_card_redeemed_cobalt' | 'item_sold_dungeons';
/**
 * The body of the request to get the order statistics
 */
export interface OrderStatisticsRequest {
  metricKeys: Array<OrderStatistic>;
}

/**
 * A json object is returned with the total amount of copies sold, the amount of copies sold in the last 24h and how many sales there are per second.
 */
export interface OrderStatisticsResponse {
  /**
   * total amount sold
   */
  total: number;
  /**
   * total sold in last 24 hours
   */
  last24h: number;
  /**
   * decimal average sales per second
   */
  saleVelocityPerSeconds: number;
}

/**
 * A security question answer given by the player using the id given by Mojang
 */
export interface SecurityAnswer extends SecurityAnswerId {
}

/**
 * A security question answer id given by Mojang
 */
export interface SecurityAnswerId {
  /**
   * A number giver by Mojang to reply a question
   */
  id: number;
}

/**
 * Binds a question to an answer id, the answer must respect the answer id.
 */
export interface SecurityChallenge {
  question: SecurityQuestion;
  answer: SecurityAnswerId;
}

/**
 * A security question requested by Mojang
 */
export interface SecurityQuestion {
  /**
   * The possible IDs are these:   1  What is your favorite pet's name?   2  What is your favorite movie?   3  What is your favorite author's last name?   4  What is your favorite artist's last name?   5  What is your favorite actor's last name?   6  What is your favorite activity?   7  What is your favorite restaurant?   8  What is the name of your favorite cartoon?   9  What is the name of the first school you attended?   10 What is the last name of your favorite teacher?   11 What is your best friend's first name?   12 What is your favorite cousin's name?   13 What was the first name of your first girl/boyfriend?   14 What was the name of your first stuffed animal?   15 What is your mother's middle name?   16 What is your father's middle name?   17 What is your oldest sibling's middle name?   18 In what city did your parents meet?   19 In what hospital were you born?   20 What is your favorite team?   21 How old were you when you got your first computer?   22 How old were you when you got your first gaming console?   23 What was your first video game?   24 What is your favorite card game?   25 What is your favorite board game?   26 What was your first gaming console?   27 What was the first book you ever read?   28 Where did you go on your first holiday?   29 In what city does your grandmother live?   30 In what city does your grandfather live?   31 What is your grandmother's first name?   32 What is your grandfather's first name?   33 What is your least favorite food?   34 What is your favorite ice cream flavor?   35 What is your favorite ice cream flavor?   36 What is your favorite place to visit?   37 What is your dream job?   38 What color was your first pet?   39 What is your lucky number?
   */
  id: number;
  /**
   * The question itself
   */
  question: string;
}

/**
 * Model is an empty string for the default model (like Steve) and \"slim\" for the slim model (like Alex)
 */
export type SkinModel = '' | 'slim';
export interface UploadSkinRequest {
  model?: SkinModel;
  /**
   * The skin image in PNG format
   */
  file: any;
}

